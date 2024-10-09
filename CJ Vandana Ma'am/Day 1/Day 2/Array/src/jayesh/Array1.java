package jayesh;

import java.util.Scanner;

public class Array1
{
	public static void main(String[] args) 
	{
		int a[];
		int sum = 0;
		
		a = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the Value : ");
			a[i] = sc.nextInt();
			sum = sum + a[i];
			
		}
		
		System.out.println();
		
		System.out.println("Array Elements :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]: " +a[i]);
			
		}
		
		System.out.println();
		System.out.println("Sum of Array : "+sum);

	}

}
