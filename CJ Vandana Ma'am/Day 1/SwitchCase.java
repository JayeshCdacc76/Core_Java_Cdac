import java.util.Scanner;

class SwitchCase{

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		int num1,num2,choice;

		System.out.println("Enter Num1: ");
		num1 =  sc.nextInt();

		System.out.println("Enter Num2: ");
		num2 = sc.nextInt();

		System.out.println("1.Addition ");
		System.out.println("2.Substraction");


		System.out.println("Enter Choice: ");
		choice =sc.nextInt();


		switch(choice)
		{
		case 1:
			System.out.println("Addition is :"+ (num1+num2));
			break;
		case 2:
			System.out.println("Substraction is :"+ (num1-num2));
			break;
		default:
			System.out.println("Wrong Choice");
			break;
		}
	
	}
}