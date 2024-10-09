package assignment_26;
import java.util.Scanner;

public class Assign_1 
{
		private int age;
		private double income;
		
		public void accept()
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Age  : ");
			age = sc.nextInt();
		
			System.out.print("Enter Income : ");
			income=sc.nextDouble();
		}
		
		public void checkLoan()
		{
			if(age>18 && age<60 && income>=25000)
			{
				System.out.println("Eligible for a loan");
			}
			else
			{
				System.out.println("Not Eligible for a loan");
			}
		}
		
		public void display()
		{
			System.out.println("Age of Person    : "+age);
			System.out.println("Income of Person : "+income);
		}
}
