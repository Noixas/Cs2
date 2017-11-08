public class BankAccountFilter implements  Filter{
    private float min = 1000;

    public boolean accept(Object x)
    {
      BankAccount account = (BankAccount) x;
      float balance = account.getMeasure();
      if(balance < min)
      {
        System.out.println("Account "+ account.getAccountNumber()+" rejected");
        return false;
      }
      else
        return true;
    }
  }
