package Example;

public class Sup 
{
	
	private int a;
	private int b;
	protected int c;
	
	public void set_data(int x,int y)
	{
		this.a = x;
		this.b = y;
		c = (a+b);
		System.out.println("Sum : "+c);
	}

}
