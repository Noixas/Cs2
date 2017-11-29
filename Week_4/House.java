import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import java.awt.*;
public class House{

  private double xLeft;
  private double yTop;
  public House(double x, double y)
    { xLeft = x;
      yTop = y;
    }
  public void draw(Graphics2D g2) {
    g2.setColor(Color.blue);
    g2.setStroke(new BasicStroke(4));
    Rectangle2D.Double body  = new Rectangle2D.Double(xLeft, yTop + 10, 60, 80);
      Rectangle2D.Double door  = new Rectangle2D.Double(xLeft + 5, yTop +55, 15, 35);
      Rectangle2D.Double window  = new Rectangle2D.Double(xLeft + 35, yTop + 40, 15, 15);
      Point2D.Double r1 = new Point2D.Double(xLeft , yTop +10);
      Point2D.Double r2 = new Point2D.Double(xLeft+30, yTop -30);
      Point2D.Double r3 = new Point2D.Double(xLeft + 60, yTop+10);
      Line2D.Double leftRoof = new Line2D.Double(r1, r2);
      Line2D.Double rightRoof = new Line2D.Double(r3, r2);
      g2.draw(body);
      g2.draw(door);
      g2.draw(window);
      g2.draw(leftRoof);
      g2.draw(rightRoof);

  }
}
