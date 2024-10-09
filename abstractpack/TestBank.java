package abstractpack;

public class TestBank {

	public static void main(String[] args) {

		CurrentAccount ob1 = new CurrentAccount(101,1000f);
		
		System.out.println("Current Account Interst is : "+ob1.calculateInterst());
		
		System.out.println("-----------------------------------");
		
		LoanAccount ob2 = new LoanAccount(102,1000f);
		
		System.out.println("Loan Account Interst is    : "+ob2.calculateInterst());
		
		System.out.println("-----------------------------------");
		
		SavingAccount ob3 = new SavingAccount(103,1000f);
	
		System.out.println("Saving Account Interst is  : "+ob3.calculateInterst());
		
		System.out.println("-----------------------------------");
	}

}
