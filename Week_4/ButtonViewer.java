/**
 This program demonstrates how to install an action listener.
*/
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonViewer
{
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 100;
   public static void main(String[] args)
   {
     JFrame frame = new JFrame();
     JPanel pane = new JPanel();
     frame.add(pane);
     JButton button = new JButton("Button A");
     pane.add(button);
     JButton buttonb = new JButton("Button B");
     pane.add(buttonb);
     ActionListener listener = new ClickListener();
     button.addActionListener(listener);
     ActionListener listenerb = new ClickListener();
     buttonb.addActionListener(listenerb);
     frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
   }

}
