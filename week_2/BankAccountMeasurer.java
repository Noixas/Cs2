public class BankAccountMeasurer implements Measurer, Filter{
    private float min = 1000;
    public float measure(Object anObject)
    {
      BankAccount account = (BankAccount) anObject;
      float balance = account.getMeasure();
        return balance;
    }
    public boolean accept(Object x)
    {
      BankAccount account = (BankAccount) x;
      float balance = account.getMeasure();
      if(balance < min)
        return false;
      else
        return true;
    }
  }
