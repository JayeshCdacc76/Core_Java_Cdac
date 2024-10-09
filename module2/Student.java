package module2;

import java.util.Scanner;

public class Student 
{
	 private int rno;
	 private String name;
     private double score;
     
     public void accept()
     {
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.print("Enter Roll No : ");
    	 rno = sc.nextInt();
    	 
    	 System.out.print("Enter Name : ");
    	 name = sc.next();
    	 
    	 System.out.print("Enter Score : ");
    	score = sc.nextDouble();
    	 
     }
	
	public void attendClass()
	{
		System.out.println("Attending the class");
	}
	
	public void apperExam()
	{
		System.out.println("Apper For Exam");
	}
	
	public void completeAssignment()
	{
		System.out.println("Complete Assignment");
	}
	
	public void display()
	{
		System.out.println("Roll No : "+rno);
		System.out.println("Name    : "+name);
		System.out.println("score   : "+score);
	}
}
