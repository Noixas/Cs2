import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
public class HouseComponent extends JComponent
 {
    public void paintComponent(Graphics g)
    {
            Graphics2D g2 = (Graphics2D)g;

            House house = new House(50, 50);

            house.draw(g2);
    }
}
