package Employee;

public class Salary extends Bonus
{
	private int inc;
	
	public void accept()
	{
		super.accept();
		inc = net/10;
	}


	public void show()
	{
		super.show();
		System.out.println("Increment  : "+inc);
	}
}
