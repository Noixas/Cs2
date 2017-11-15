import java.awt.Rectangle;
import java.awt.Point;
public class Square extends Rectangle{
  private int _length;
  private int _xCenter;
  private int _yCenter;
  public Square(int xCenter, int yCenter, int pLength)
  {
    Point pos = new Point(xCenter,yCenter);
    super.setLocation(pos);
    super.setSize(pLength, pLength);
    _xCenter = xCenter;
    _yCenter = yCenter;
    _length = pLength;

  }
  public double getArea()
  {
    return _length * _length;
  }

  public String toString()
  {
    String definition =  super.toString() + " \n The area is "+ getArea();

    return definition ;

  }
}
