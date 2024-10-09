package Exception;

import java.util.Scanner;

public class trycatch 
{
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);	

		int a,b,c = 0,d;

		System.out.println("Enter Value of a nad b: ");

		a = sc.nextInt();
		b = sc.nextInt();
		
		try 
		{
			c=a+b;
			System.out.println("Addition : "+c);
			c=a-b;
			System.out.println("Substraction : "+c);
			c=a*b;
			System.out.println("Multiplication: "+c);
			c=a/b;
			System.out.println("Division: "+c);
		}
		catch(Exception obj)
		{
			System.out.println("Not Divide");
			System.exit(0);
		}
		finally
		{
			d = a*b*c;
			System.out.println("Multiplication of 3 Number : "+d);
		}

	}

}

