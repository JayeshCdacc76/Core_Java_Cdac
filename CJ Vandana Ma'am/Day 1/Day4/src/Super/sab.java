package Super;

public class sab extends Sup
{
	
	private int p;
	private int q;
	
	public sab()
	{
		this.p=3;
		this.q=4;
	}

	
	public sab(int u,int v,int x,int y)
	{
		super(u,v);
		this.p = x;
		this.q = y;
	
	}

	public void show()
	{
		super.show();
		System.out.println("Value of P : "+p);
		System.out.println("Value of Q : "+q);
	}
	
}
