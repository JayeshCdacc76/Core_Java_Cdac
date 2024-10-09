package jayesh;

import java.util.Scanner;

public class Replace
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
	
		int j= 0;
		int r =0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				a[j]=a[i];
				j++;
			}
			else
			{
				a[i]=0;
				r++;
			}
			
			
		}
		
		System.out.println();
		
		System.out.println("Array Positive Elements :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]: " +a[i]);
			
		}
		
		System.out.println();
		System.out.println("Total Replace Number : "+r);
		
	}

}
