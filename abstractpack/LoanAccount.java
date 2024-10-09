package abstractpack;

public class LoanAccount extends BankAccount{

	public LoanAccount(int id, float balance) {
		super(id, balance);
	}

	public float calculateInterst()
	{
		return (balance * 0.056f);
	}

}
