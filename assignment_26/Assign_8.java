package assignment_26;

import java.util.Scanner;

public class Assign_8 {
	
	private int num1;
	private int num2;
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the First Number : ");
		num1=sc.nextInt();
		
		System.out.print("Enter the Second Number : ");
		num2=sc.nextInt();
	}
	
	public void display()
	{
		System.out.println("Number 1 : "+num1);
		System.out.println("Number 2 : "+num2);
	}
	
	public void check()
	{
		int n = (num1>num2)?num1:num2;
		
		System.out.println("Maximum Number Between "+ num1+" & "+num2+" : "+n);
	}

}
