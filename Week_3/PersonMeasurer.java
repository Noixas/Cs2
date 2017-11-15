public class PersonMeasurer implements Measurer, Filter{
  public float measure(Object anObject)
  {
    Person aPerson = (Person) anObject;
    float height = aPerson.getMeasure();
      return height;
  }
  public boolean accept(Object anObject)
  {
    if(anObject != null)
    return true;
    else
    return false;
  }
}
