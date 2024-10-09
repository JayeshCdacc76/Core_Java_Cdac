package Employee;

public class Bonus extends Emp
{
	
	protected int bonus=500;
	protected int net;
	
	public void accept()
	{
		super.accept();
		net = sal + bonus;
	}

	public void show()
	{
		super.show();
		System.out.println("Bonus      : "+bonus); 
		System.out.println("Net Salary : "+net);
	
	}
}