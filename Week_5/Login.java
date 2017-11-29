import java.nio.file.Paths;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Scanner;
import java.util.*;
public class Login extends JPanel{
  private JLabel userName;
  private JTextArea userNameField;
  private JLabel password;
  private JTextArea passwordField;

  public Login()
  {
    setLayout(new GridLayout(5, 2));

    add(new Panel());
    add(new Panel());
    CreateUserFields();
    add(new Panel());
    add(new Panel());

    CreatePasswordFields();
    CreateButton();
    List<String> accounts = new LinkedList<String>();
try{
    Scanner input;
    input = new Scanner(Paths.get("user.txt"));
    while (input.hasNextLine()) {
        String line = input.nextLine();
        accounts.add(line);
        System.out.println(line);
    }
    input.close();
  }catch(Exception e){
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
      ActionListener listener = new ClickLogin();
      button.addActionListener(listener);
      JPanel buttonPanel = new JPanel();
      buttonPanel.add(button);
      add(buttonPanel);
  }

}
