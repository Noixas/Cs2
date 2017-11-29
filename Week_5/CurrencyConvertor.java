/**
 This program demonstrates how to install an action listener.
*/
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CurrencyConvertor
{
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 200;
   public static void main(String[] args)
   {
     JFrame frame = new JFrame();
     JPanel pane = new JPanel();
     pane.setLayout(new GridLayout(2, 5));
     frame.add(pane);
     InputConverter inputA = new InputConverter(300,30,false);
     InputConverter inputB = new InputConverter(300,30,true);


     pane.add(inputA);
     pane.add(inputB);
     CreateButton(pane,inputA,inputB);

     frame.setMinimumSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);

   }
private static void CreateButton(JPanel pane,InputConverter inputA, InputConverter inputB)
{
  JButton button = new JButton("Convert");
  button.setPreferredSize(new Dimension(200, 40));
  ActionListener listener = new ClickListener(inputA,inputB);
  button.addActionListener(listener);
  JPanel buttonPanel = new JPanel();
  buttonPanel.add(button);
  pane.add(buttonPanel);
}

}
