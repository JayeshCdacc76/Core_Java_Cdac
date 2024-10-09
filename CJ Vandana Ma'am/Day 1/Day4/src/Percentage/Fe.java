package Percentage;

import java.util.Scanner;

public class Fe 
{
	
	private int rno;
	private String name;
	private int mark[]=new int[3];
	protected int total=0;
	
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Roll no : ");
		rno = sc.nextInt();
		
		System.out.print("Enter Name : ");
		name = sc.next();
		
		System.out.println("FE Mark : ");
		
		for(int i =0;i<3;i++)
		{	
			System.out.print("Enter Mark : ");
		
			mark[i] = sc.nextInt();
			
			total = total + mark[i];
	
		}
		
		System.out.println(total);
		
	}	
	
	public void display()
	{
		System.out.print(rno +" "+name+" ");
		
	}
	

}
