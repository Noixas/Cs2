//Rodrigo Alejandro Chávez Mulsa 01/11/2017
public class BankAccount
{
	//private static double fee;	
	private static int maxTransactions;	
	private static double feePerExtraTrans; //All fees should be the same for everyone
	private static String GlobalString = "";
	private static int accountQuantities = 0;
	private int accountNumber;
	private double balance;
	private int transThisMonth = 0;
	
	public BankAccount(double initialBalance)
   { 
   	   balance = initialBalance;
   	   accountNumber = accountQuantities;
   	   accountQuantities++;
   	   System.out.println("New Account with number "+ accountNumber +" with: " + balance);
   }
   public void deposit(double amount)
   {  
   	  double newBalance = balance + amount;
      balance = newBalance;
      String transString = "Bank account " + accountNumber + ": deposit  " + amount + " euros --- balance: " + balance + "\n";
      GlobalString += transString;
    //  System.out.println(GlobalString);
      transThisMonth++;
   }
   public void withdraw(double amount)
   {  
   	  double newBalance = balance - amount ;
      balance = newBalance; 
      String transString = "Bank account " + accountNumber + ": withdraw " + amount + " euros --- balance: " + balance + "\n";
      GlobalString += transString;
     // System.out.println(GlobalString);
      transThisMonth++;
   }
   public double getBalance()
   {  
   	   return balance;
   }
   public void deductMonthlyCharge()
   {
   	   System.out.println("");
   	   System.out.println("Account number: " + accountNumber);
   	   System.out.println("Free transactions this month: " + maxTransactions + " ...Transactions this month: " + transThisMonth);
   	   System.out.println("Current Fee per extra transaction: " + getFee());
   	   if(transThisMonth > maxTransactions)//If we wxceed the free transactions
   	   	 {
   	   	 	 double feeThisMonth = feePerExtraTrans * (transThisMonth - maxTransactions);
   	   	 	 balance -= feeThisMonth;//Charge all the extra fees depending on how many extra trans it made
   	   	 	 System.out.println("Fee this month: " + feeThisMonth);
   	   	 	 System.out.println("Charging month fee... ");
   	   	 	
   	   	 }
   	   	  System.out.println("Balance end month: " + balance);
   	   	 System.out.println("Resetting counter... " );
   	    transThisMonth = 0;
   }
   public static void setFee(double pFee)
   {
   	   feePerExtraTrans = pFee;
   }
   public static double getFee()
   {
   	   return feePerExtraTrans;
   }   
   public static void setMaxFreeTransactions(int pNum)
   {
   	   maxTransactions = pNum;
   }
   public static String getGlobalString()
   {
   	   return GlobalString;
   }
   
   
   
}