package module2;

public class MathTest 
{
	public static void main(String[] arg)
	{
		System.out.println(Math.sqrt(144));		//12
		System.out.println(Math.abs(-66));		//66
		System.out.println(Math.min(23,44));	//23
		System.out.println(Math.max(23,44));	//44
		System.out.println(Math.random());	    //to print random values between 0 to 1;
		double d = (int)(Math.random()*100);    //to print only integer
		System.out.println(d);
		
		System.out.println(Math.ceil(543.36));
		System.out.println(Math.floor(543.36));
		System.out.println(Math.round(878.36));
		System.out.println(Math.pow(5,3));
	}

}
