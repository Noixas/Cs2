import javax.swing.*;
import javax.swing.JFrame;

public class OlympicRingViewer {
  public static void main(String[] args)
      {
         JFrame frame = new JFrame();

      final int FRAME_WIDTH = 800;
      final int FRAME_HEIGHT = 500;

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("An Empty Frame");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      OlympicRingComponent componentb = new OlympicRingComponent();
      frame.add(componentb);

      frame.setVisible(true);


   }
 }
