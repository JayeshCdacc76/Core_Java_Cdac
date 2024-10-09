
package Employee;

import java.util.Scanner;

public class Emp 
{
	private int id;
	private String name;
	protected int sal;
	
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter id: ");
		id = sc.nextInt();
		
		System.out.print("Enter Name : ");
		name = sc.next();
		
		System.out.print("Enter Salary : ");
		sal = sc.nextInt();
		
	}
	
	public void show()
	{
		System.out.println("Emp id     : "+id); 
		System.out.println("Emp Name   : "+name); 
		System.out.println("Emp salary : "+sal); 
		
	}
	
}
