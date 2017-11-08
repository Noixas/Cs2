public class TesterClass{
  public static void main(String[] args)
  {
    Person a = new Person("Eric", 170);
    Person b = new Person("Tom", 180);
    Person c = new Person("Lisa", 160);
    Person d = new Person("Harry", 185);

    Measurer measurer = new PersonMeasurer();
    DataSet data = new DataSet(measurer);
    data.add(a);
    data.add(b);
    data.add(c);
    data.add(d);

    System.out.println("Average is: "+ data.getAverage());
    Person highest = (Person) data.getMaximum();
    System.out.println("Highest Person is: " + highest.getName() +" width height: " + highest.getMeasure());
  }
}
