package module4;

import java.util.Scanner;

public class Emp 
{
	private int empId;
	private String name;
	private double balance;
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Id   : ");
		empId = sc.nextInt();
		System.out.print("Enter Name : ");
		name = sc.next();
		System.out.println("Enter Balance : ");
		balance=sc.nextDouble();
	}
	
	public void display()
	{
		
		System.out.println("Emp Id   : "+empId);
		System.out.println("Name     : "+name);
		System.out.println("Balance  : "+balance);
	}
	
	public void checkEmpNo()
	{
		if(empId>0)
		{
			System.out.println("Valid Id");
		}
		else
		{
			System.out.println("Invalid Id");
		}
	}
	
	public void checkBal()
	{
		if(balance>0 && balance<100000)
		{
			System.out.println("Valid Balance");
		}
		else
		{
			System.out.println("Invalid Balance");
		}
	}
}



