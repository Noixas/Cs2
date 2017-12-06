import java.nio.file.Paths;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.File;
import java.util.Scanner;
import java.util.*;
public class Login extends JPanel{
  private JLabel userName;
  private JTextArea userNameField;
  private JLabel password;
  private JTextArea passwordField;
  private Map<String, String> accounts;
  private int attempts = 0;
  private JFrame frame;
  public Login(JFrame pFrame)
  {
    frame = pFrame;
    setLayout(new GridLayout(5, 2));

    add(new Panel());
    add(new Panel());
    CreateUserFields();
    add(new Panel());
    add(new Panel());

    CreatePasswordFields();
    CreateButton();
    accounts = new HashMap<String, String>();
  try{
      Scanner input;
      input = new Scanner(Paths.get("user.txt"));
      int count = 0;
      while (input.hasNextLine()) {
          String line = input.nextLine();
          String[] words = line.split("\\s");
          accounts.put(words[0], words[1]);
          for(int i = 0; i < words.length; i++)
          {
            System.out.println("Count: "+count+" Word "+words[i]);
          }
      }
      input.close();
    }catch(Exception e){
      System.out.println("Error trying to read usrs file");
      e.printStackTrace();
    }
  }
  private void CreateUserFields()
  {
    userName = new JLabel("User name: ");
    add(userName);
    userNameField = new JTextArea(1,1);
    add(userNameField);
  }
  private void CreatePasswordFields()
  {
    password = new JLabel("Password: ");
    add(password);
    passwordField = new JTextArea(1,1);
    add(passwordField);
  }
  private void CreateButton()
  {
      JButton button = new JButton("LOGIN");
      button.setPreferredSize(new Dimension(200, 40));
      ActionListener listener = new ClickLogin(this);
      button.addActionListener(listener);
      JPanel buttonPanel = new JPanel();
      buttonPanel.add(button);
      add(buttonPanel);
  }
  public void submitPassword()
  {
    System.out.println(userNameField.getText());
    checkUsers();
  }
  private void checkUsers()
  {
    Set<String> users = accounts.keySet();
    boolean found = false;
    for (String user : users) {
      if(user.compareToIgnoreCase(userNameField.getText().trim()) == 0)
      {
        System.out.println("User matches");
        found = true;
        checkPassword(user);
      }
    }
    if(found == false)
    System.out.println("Wrong User");
  }
  private void showWelcome()
  {
    removeAll();
    JPanel paneWelcome = new JPanel();
    JLabel welc = new JLabel("Welcome back");
    paneWelcome.add(welc);
    add(paneWelcome);
    revalidate();
  }
  private void checkPassword(String user)
  {
    if(accounts.get(user).equals(passwordField.getText()))
    {
      System.out.println("Password match too, login...");
      showWelcome();
    }else{
        System.out.println("Password doesnt match");
      attempts++;
      if(attempts >= 3){
        for(int i = 0 ; i< 60; i++)
        System.out.println("3 Attempts... calling security");
        System.exit(0);
      }
    }
  }

}
