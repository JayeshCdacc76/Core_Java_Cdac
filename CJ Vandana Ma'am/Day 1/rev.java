//calculate total sum of even odd ,odd num
// print total even no and odd num
import java.util.Scanner;

class rev {

	public static void main(String args[])
	{
		int num=5,e_count=0,o_count=0,i=0;
		Scanner sc = new Scanner(System.in);
		int k = 0, m =0;
	
		while(i<num){
			System.out.println("Enter Number : ");
			int n = sc.nextInt();

			if (n%2==0)
			{
				e_count+=n;
				k++;
			}
			else{
				o_count+=n;
				m++;
			}
			i++;
			
		}

	
		System.out.println("sum of Odd: "+o_count);
		System.out.println("sum of even: "+e_count);
		System.out.println("Odd: "+m);
		System.out.println("even: "+k);

	}
}