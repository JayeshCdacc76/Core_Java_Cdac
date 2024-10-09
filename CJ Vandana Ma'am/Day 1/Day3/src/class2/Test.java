package class2;

public class Test {
	
	private int a;
	private int b;
	private int c;
	
	public void set_data(int x,int y)
	{
		a = x;
		b = y;
		c = a+ b;
	}
	
	public void show()
	{
		System.out.println("A Value : "+a);
		System.out.println("B Value : "+b);
		System.out.println("C Value : "+c);
	}
	
	public int comp()
	{
		return c;
	}

}
