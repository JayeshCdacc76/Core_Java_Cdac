package Employee;

public class Emp
{
	private int empid;
	private String name;
	private int salary;
	
	public void set_data(int id,String nm,int sal)
	{
		empid = id;
		name = nm;
		salary = sal;
	}
	
	public void show_data()
	{
		System.out.println("Empid   : "+empid);
		System.out.println("Name    : "+name);
		System.out.println("Salary  : "+salary);
	}
	
	public int comp()
	{
		return salary;
	}
}
