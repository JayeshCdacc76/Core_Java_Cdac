package module4;

import java.util.Scanner;

public class User
{
	private String name;
	private int age;
	private double salary;
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name    : ");
		name = sc.next();
		System.out.println("Enter Age     : ");
		age = sc.nextInt();
		System.out.println("Enter salaray : ");
		salary=sc.nextDouble();
	}
	
	public void display()
	{
		System.out.println("Name   : "+name);
		System.out.println("Age    : "+age);
		System.out.println("Salary : "+salary);
	}
	
	public void checkAge()
	{
		if(age>=18 && age<100)
		{
			System.out.println("Eligible to Vote");
		}
		else
		{
			System.out.println("Not Eligible to Vote");
		}
	}
	
	public void checkSal()
	{
		if(salary>0 &&salary<100000)
		{
			System.out.println("Valid Salary");
		}
		else
		{
			System.out.println("Invalid Salary");
		}
	}
}
