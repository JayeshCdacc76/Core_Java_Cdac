package Percentage;

import java.util.Scanner;

public class Se extends Fe
{
	private int m[]=new int[3];
	private int tot=0;

	public void accept()
	{
		super.accept();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("SE Mark : ");
		
		for(int i=0;i<3;i++)
		{
			
			System.out.print("Enter Mark : ");
			m[i] = sc.nextInt();
			
			tot = tot + m[i];		
			
		}
		
		tot = tot+total;
		System.out.println(tot);
		System.out.println();
		
	}
	
	public void display()
	{
		super.display();

		System.out.println((float)tot/6);
	
	}

}
