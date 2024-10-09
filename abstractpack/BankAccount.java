package abstractpack;

public abstract class BankAccount {
	
	protected int id;
	protected float balance;

	public BankAccount(int id, float balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public abstract float calculateInterst();
	
}
