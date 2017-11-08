//Rodrigo Alejandro Chávez Mulsa 01/11/2017
public class TesterClass
{ 
	public static void main(String[] args)
   { 
   	   BankAccount.setMaxFreeTransactions(3);
   	   System.out.println("Current fee is: " + BankAccount.getFee());
   	   BankAccount.setFee(5);   	   
   	   System.out.println("New current fee is: " + BankAccount.getFee());
   	   BankAccount[] accounts = new BankAccount[5];
   	    for(int i = 0; i < 5; i++)
   	   {
   	   	    BankAccount account = new BankAccount(200);
   	   	    accounts[i] = account;
   	   }
   	   for(int i = 0; i < 5; i++)
   	   {
   	   	   accounts[0].deposit(50);
   	   	   accounts[1].withdraw(60);
   	   }
   	    for(int i = 0; i < 6; i++)
   	   {
   	   	   accounts[2].deposit(30);
   	   	   accounts[4].withdraw(20);
   	   }
   	   accounts[1].deposit(200);
   	   System.out.println(BankAccount.getGlobalString());
   	   System.out.println("New Month, charge fees...");   
   	   for(int i = 0; i < accounts.length;i++)
   	   	   accounts[i].deductMonthlyCharge();
   	   System.out.println("");
   	  
   	   
   }
  
}