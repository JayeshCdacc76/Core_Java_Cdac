package module3;

import java.util.Scanner;

public class Ifdemo2 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A First Number  : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter A Second Number : ");
		int num2 = sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println(num1+" is Greater");
		}
		else if(num1<num2)
		{
			System.out.println(num2+" is Greater");
		}
		else
		{
			System.out.println(num1+" & "+num2+" Are Same");
		}

	}
}