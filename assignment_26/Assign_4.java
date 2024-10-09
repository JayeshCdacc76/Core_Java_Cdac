package assignment_26;

import java.util.Scanner;

public class Assign_4 {
	
	private int age;
	private boolean citizen;
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Age : ");
		age = sc.nextInt();
		
		System.out.print("Citizen of City (true/false) : ");
		citizen = sc.nextBoolean();
		
	}
	
	public void display()
	{
		System.out.println("Age     : "+age);
		System.out.println("citizen : "+citizen);
	}
	
	public void checkEligible()
	{
		if(age>=18 && citizen==true)
		{
			System.out.println("Eligible for Vote");
		}
		else
		{
			System.out.println("Not Eligible for Vote");
		}
	}
}
