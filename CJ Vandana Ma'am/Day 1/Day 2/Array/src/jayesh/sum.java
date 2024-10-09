package jayesh;

import java.util.Scanner;

public class sum
{
	public static void main(String[] args) 
	{
		int a[],b[];
	
		
		a = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the Value : ");
			a[i] = sc.nextInt();
			
		}
		
		b = new int[5];
		
	int i;
	
	int temp=0;
		
		for( i=0;i<a.length;i++)
		{
			int sum =0;
			
			temp = a[i];
			
			while(temp>0)
			{
				sum = sum+temp%10;
				temp = temp /10;
			}
			b[i]=sum;
						
		}
		
		System.out.println();
		
		System.out.println("Array Positive Elements :");
		for(i=0;i<b.length;i++)
		{
			System.out.println("b["+i+"]: " +b[i]);
			
		}
		
		
	}

}
