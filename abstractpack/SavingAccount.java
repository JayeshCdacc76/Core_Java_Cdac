package abstractpack;

public class SavingAccount extends BankAccount{

	public SavingAccount(int id, float balance) {
		super(id, balance);
	}
	
	public float calculateInterst()
	{
		return (balance * 0.01f);
	}

}
