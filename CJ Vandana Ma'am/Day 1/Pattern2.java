
import java.util.Scanner;

class Pattern{

	public static void main(String args[])
	{
	
	int n,i,j;
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number : ");
	n = sc.nextInt();

	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++){
			System.out.println(" * ");
		}
		System.out.println();

	}

	}
}