package assignment_26;

import java.util.Scanner;

public class Assign_2 {
	
	private int sub1;
	private int sub2;
	private int sub3;
	private int totalMark;
	private double percentage;
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Subject 1 Mark : ");
		sub1 = sc.nextInt();
		System.out.print("Enter Subject 2 Mark : ");
		sub2 = sc.nextInt();
		System.out.print("Enter Subject 3 Mark : ");
		sub3 = sc.nextInt();
		
		totalMark = sub1+sub2+sub3;
		
		percentage = totalMark/3.0;	
	}
	
	public void display()
	{
		System.out.println("subject 1  : "+sub1);
		System.out.println("subject 2  : "+sub2);
		System.out.println("subject 3  : "+sub3);
		System.out.println("Total Mark : "+totalMark);
		System.out.println("Average    : "+percentage);
	}
	public void check()
	{
		if(sub1>=40 && sub2>=40 && sub3>=40 && percentage>=60)
		{
			System.out.println("You are Passed");
		}
		else
		{
			System.out.println("You are Failed");
		}
	}
	

}
