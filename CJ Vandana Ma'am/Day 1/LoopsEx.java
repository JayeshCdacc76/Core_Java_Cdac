// factorial of num
import java.util.Scanner;

class LoopEx {

	public static void main(String args[])
	{
		int num,fact=1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		num = sc.nextInt();
		int i = 1;
		while(i<=num){
			fact = fact *i;
			i++;
		}

		System.out.println("Factorial: "+fact);
	}
}