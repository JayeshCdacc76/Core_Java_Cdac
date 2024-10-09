package abstractpack;

public class CurrentAccount extends BankAccount{
	

	public CurrentAccount(int id, float balance) {
		super(id, balance);
	}

	public float calculateInterst()
	{
		return (balance * 0.07f);
				
	}

}
