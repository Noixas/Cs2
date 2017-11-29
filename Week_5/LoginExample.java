import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LoginExample{
  private static final int FRAME_WIDTH = 600;
  private static final int FRAME_HEIGHT = 400;

  public static void main(String[] args)
  {
    JFrame frame = new JFrame();
    JPanel pane = new JPanel();
  //  pane.setLayout(new GridLayout(2, 5));
    frame.add(pane);
    Login log = new Login();
    pane.add(log);
    frame.setMinimumSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }
}
