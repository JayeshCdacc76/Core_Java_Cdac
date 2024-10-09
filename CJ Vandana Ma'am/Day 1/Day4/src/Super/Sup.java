package Super;

public class Sup {
	
	private int a;
	private int b;
	protected int c;
	
	public Sup()
	{
		this.a = 1;
		this.b = 2;
	}
	
	public Sup(int x,int y)
	{
		this.a = x;
		this.b = y;	
	}
	
	public void show()
	{
		
		System.out.println("Value of A : "+a);
		System.out.println("Value of B : "+b);
	}

}
