import javax.swing.*;
import javax.swing.JFrame;

public class MainClass{
  public static void main(String[] args)
      {
         JFrame frame = new JFrame();

      final int FRAME_WIDTH = 600;
      final int FRAME_HEIGHT = 500;

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("An Empty Frame");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      HouseComponent component = new HouseComponent();
      frame.add(component);

      frame.setVisible(true);


   }
 }
