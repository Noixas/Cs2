public class TimeDepositAccount extends BankAccount{
	private static double _interestRate = .2;
	private int _minMonths;
	private int _elapsedMonths;
	private static double _withdrawPenalty = 150;
	public TimeDepositAccount(double initialBalance, int pMonths)
	{
		super(initialBalance);
		_minMonths = pMonths;
	}
	public void addInterest()
	{
		double interest = getBalance() * _interestRate / 100 ;
	}
	public void nextMonth()
	{
		addInterest();
		_elapsedMonths++;
	}
	public void withdraw(double amount)
	{
		if(_elapsedMonths >= _minMonths)
		{
			super.withdraw(amount);
		}
		else
		{
			System.out.println("Penalty of "+_withdrawPenalty+" for early withdraw, wait "+_minMonths+" month(s) to withdraw");
			super.withdraw(amount + _withdrawPenalty) ;

		}
	}
}
