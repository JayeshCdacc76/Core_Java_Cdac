package Arrayobject;

import java.util.Scanner;

public class emp
{
		private int empid;
		private String name;
		private int salary;
		
		public void accept()
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Empid : ");
			 empid = sc.nextInt();
			
			System.out.print("Enter Emp Name : ");
			 name = sc.next();
			
			System.out.print("Enter Emp Salary : ");
			 salary = sc.nextInt();
			
		}
		
		public void show()
		{
			System.out.println("Empid   : "+empid);
			System.out.println("Name    : "+name);
			System.out.println("Salary  : "+salary);
			System.out.println("----------------------");
		}
		
		public int comp()
		{
			return salary;
		}
	
}
