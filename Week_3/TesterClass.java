public class TesterClass{
  public static void main(String[] args)
  {
    int months = 3;
      //  TimeDepositAccount BankA = new TimeDepositAccount(1000, months);
    TimeDepositAccount BankB = new TimeDepositAccount(1505,months);
    for(int i=1 ; i<= months;i++)
    {
      System.out.println("Month " + i);
      BankB.nextMonth();
      if(i == months-2)//Test the early withdraw
      BankB.withdraw(500);

    }
    BankB.withdraw(200);
    System.out.println(BankB.getGlobalString());

    Measurer BankMeas = new BankAccountMeasurer();
    //Filter bankFilter = new BankAccountFilter();
    DataSet BankData = new DataSet(BankMeas);
  //  BankData.add(BankA);
    BankData.add(BankB);
    System.out.println();

    Square sq = new Square(2,2,3);
    System.out.println(  sq.toString());
    System.out.println();

    Employee Mark = new Executive("Mark", 10500, "Sales");
    System.out.println(Mark.toString());





  }
}
