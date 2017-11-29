import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.*;
public class OlympicRingComponent extends JComponent
 {
    public void paintComponent(Graphics g)
    {
            Graphics2D g2 = (Graphics2D)g;


            OlympicRing blue = new OlympicRing(100, 100, Color.blue);
            OlympicRing yellow = new OlympicRing(200, 200, Color.yellow);
            OlympicRing black = new OlympicRing(300, 100, Color.black);
            OlympicRing green = new OlympicRing(400, 200, Color.green);
            OlympicRing red = new OlympicRing(500, 100, Color.red);

            blue.draw(g2);
            yellow.draw(g2);
            black.draw(g2);
            green.draw(g2);
            red.draw(g2);

    }
}
