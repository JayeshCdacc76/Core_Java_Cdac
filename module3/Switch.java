package module3;

import java.util.Scanner;

public class Switch 
{

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		num = sc.nextInt();
		
		switch(num)
		{
			case 5:
				System.out.println("Movie time");
				break;
				
			case 6:
				System.out.println("Super Saturday");
				break;	
				
			case 7:
				System.out.println("Sleepy Sunday");
				break;
				
			default:
				System.out.println("Please Enter Right Things");
			
		}
	}

}
