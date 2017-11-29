import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import java.awt.*;
public class OlympicRing{

  private double xLeft;
  private double yTop;
  private Color color;
  public OlympicRing(double x, double y, Color col)
    { xLeft = x;
      yTop = y;
      color = col;
    }
  public void draw(Graphics2D g2) {
    g2.setColor(color);
    g2.setStroke(new BasicStroke(10));
    Ellipse2D.Double body  = new   Ellipse2D.Double(xLeft, yTop, 200, 200);
      g2.draw(body);

  }
}
