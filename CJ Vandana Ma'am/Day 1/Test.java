import java.util.Scanner;

class Test
{

	public static void main(String args[])
	{
			Scanner obj = new Scanner(System.in); //new allocate the dynamic memory
			int a;
			
			System.out.print("Enter a: ");
			a= obj.nextInt();			//method of scanner class .. nextInt() is function, for char use only next(),for float value we use nextFloat()

			
 
		
			if(a>=0)
			{
				System.out.println("positive Value");
				System.out.println("Number is :" +a);
			}
			else
			{
				System.out.println("negative Value");
				System.out.println("Number is :"+ a);
			}


	}
	
}
