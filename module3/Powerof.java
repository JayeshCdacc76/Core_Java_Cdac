package module3;

public class Powerof 
{
	
	public static void main(String arg[])
	{
		int num =34;
		
		int power = num%10;
		int base = num/10;
		
		System.out.println(Math.pow(base,power));
	}

}
