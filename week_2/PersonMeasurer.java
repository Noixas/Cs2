public class PersonMeasurer implements Measurer{
  public float measure(Object anObject)
  {
    Person aPerson = (Person) anObject;
    float height = aPerson.getMeasure();
      return height;
  }
}
