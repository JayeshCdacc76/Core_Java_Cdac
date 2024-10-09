package jayesh;

import java.util.Scanner;

public class array_two
{
	public static void main(String[] args) 
	{
		int a[],b[],c[];

		a = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the Value A : ");
			a[i] = sc.nextInt();
		}
		
		b = new int[5];
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print("Enter the Value B : ");
			b[i] = sc.nextInt();
			
		}
		
		c = new int[10];
		
		for(int i=0;i<c.length;i=i+2)
		{
			 c[i] = a[i / 2];
	         c[i + 1] = b[i / 2];
		}
		
		System.out.println();

		System.out.println("Array Elements of A :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]: " +a[i]);
			
		}
		
		System.out.println();
		System.out.println("Array Elements of B:");
		for(int i=0;i<b.length;i++)
		{
			System.out.println("b["+i+"]: " +b[i]);
			
		}
		
		System.out.println();
		System.out.println("Array Elements of C:");
		for(int i=0;i<c.length;i++)
		{
			System.out.println("c["+i+"]: " +c[i]);
			
		}
		
		
	}

}