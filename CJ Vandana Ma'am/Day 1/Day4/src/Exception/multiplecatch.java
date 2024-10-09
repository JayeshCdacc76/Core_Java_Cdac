package Exception;

import java.util.Scanner;

public class multiplecatch 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);	

		int a,b,c = 0;
		int arr[];
		arr= new int[2];

		System.out.println("Enter Value of a nad b: ");

		a = sc.nextInt();
		b = sc.nextInt();
		
		try 
		{
			arr[0] = 0;
			arr[1] = arr[2]/b;  //  ArrayIndexOutOfBoundsException
			
			c=a/b;
			System.out.println("Division: "+c);
			c=a+b;
			System.out.println("Addition : "+c);
			c=a-b;
			System.out.println("Substraction : "+c);
			
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Not Divide");
			System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}

	}

}
