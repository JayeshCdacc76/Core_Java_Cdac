package jayesh;

import java.util.Scanner;

public class Array2
{
	public static void main(String[] args) 
	{
		int a[];
		int sum = 0;
		int odd = 0;
		int even = 0;
		
		a = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the Value : ");
			a[i] = sc.nextInt();
			
		}
		
		System.out.println();
		
		System.out.println("Array Elements :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]: " +a[i]);
			
		}
		
		for(int i=0;i<a.length;i++)
		{
		
			sum = sum + a[i];
			
			if(a[i]%2==0)
			{
				even = even +a[i];
			}
			else
			{
				odd = odd + a[i];
			}
		}
		
		System.out.println();
		System.out.println("Sum of Array : "+sum);
		System.out.println("Sum of Even  : "+even);
		System.out.println("Sum of odd   : "+odd);
		
	}

}