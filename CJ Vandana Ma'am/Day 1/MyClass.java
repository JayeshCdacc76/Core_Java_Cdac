import java.util.Scanner;

class MyFirst
{

	public static void main(String args[])
	{
			Scanner obj = new Scanner(System.in); //new allocate the dynamic memory
			float a,b,c;
			
			// System.out.print("Enter a: ");
			// a= obj.nextFloat();			//method of scanner class .. nextInt() is function, for char use only next(),for float value we use nextFloat()

			// System.out.print("Enter b: ");
			// b= obj.nextFloat();
			
			// c= a*b;
			// System.out.println("Multiplication : "+c);
			
			// System.out.println("====================================");
 
			char name; 

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Your Name: ");
			name= sc.next().charAt(0);

			System.out.println("Hello "+name);

			System.out.println("====================================");

			// if(c>=0){
			// 	System.out.println("positive Value");
			// }
			// else
			// {
			// 	System.out.println("negative Value");
			// }


	}
	
}
