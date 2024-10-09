package jayesh;

import java.util.Scanner;

public class positive
{
	public static void main(String[] args) 
	{
		int a[],b[];
		int p=0;
		
		a = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the Value : ");
			a[i] = sc.nextInt();
			
		}
		
		b = new int[5];
	
		int j= 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				b[j]=a[i];
				j++;
			}
			
			
		}
		
		System.out.println();
		
		System.out.println("Array Positive Elements :");
		for(int i=0;i<j;i++)
		{
			System.out.println("b["+i+"]: " +b[i]);
			
		}
		
		System.out.println();
		System.out.println("Total Positive Number : "+j);
		
	}

}
