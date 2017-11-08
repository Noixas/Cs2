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
    System.out.println();

    BankAccount BankA = new BankAccount(1000);
    BankAccount BankB = new BankAccount(100);
    BankAccount BankC = new BankAccount(1800);
    BankAccount BankD = new BankAccount(999);
    Measurer BankMeas = new BankAccountMeasurer();
    Filter bankFilter = new BankAccountFilter();
    DataSet BankData = new DataSet(BankMeas, bankFilter);
    BankData.add(BankA);
    BankData.add(BankB);
    BankData.add(BankC);
    BankData.add(BankD);

    BankAccount biggest = (BankAccount) BankData.getMaximum();
    System.out.println("biggest bank is: " + biggest.getMeasure());
    System.out.println("Total Accounts Accepted: "+BankData.getCount());
    System.out.println();

    DataSet comparableStrings = new DataSet();
    comparableStrings.add("alfa");
    comparableStrings.add("AAAA");
    comparableStrings.add("5151");
    comparableStrings.add("tom");
    comparableStrings.add("deltA");
    String biggestS = (String)  comparableStrings.getMaxComparable();
    String smallestS = (String) comparableStrings.getMinComparable();
    System.out.println("Smallest String is: " + smallestS);
    System.out.println("Biggest String is: " + biggestS);



  }
}
