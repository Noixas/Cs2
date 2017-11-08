public class Person implements Measurable{
  private String _name;
  private float _height;

  public Person(String pName, float pHeight)
  {
    _name = pName;
    _height = pHeight;
    System.out.println("New Person: " + _name + " with height: " + _height);
  }
  public float getMeasure()
  {
    return _height;
  }
  public String getName()
  {
    return _name;
  }
}
