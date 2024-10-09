package Arrayobject;

import java.util.Scanner;

public class main // Main File name Change
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many Record To Save : ");
		int n = sc.nextInt();
		int total=0;
		float avg;
		emp ob[]= new emp[n];
		
		for(int i=0;i<n;i++)
		{	
			ob[i] = new emp();
			ob[i].accept();
			total = total +ob[i].comp();
		}
		
		System.out.println("----------------------");
		
		for(int i=0;i<n;i++)
		{
			ob[i].show();
		}
		
		int k = 0;
		int max = ob[0].comp();
		for(int i=1;i<n;i++)
		{
			if(ob[i].comp()>max)
			{
				max = ob[i].comp();
				k = i;
			}
		}
		
		System.out.println("Total Salary   : "+total);
		System.out.println("Avgrage Salary : "+total/(float) n);	
		
		System.out.println("----------------------");
		System.out.println("Maximum Salary : "+max);
		System.out.println("Maximum : ");
		ob[k].show();
	}

}
