package Example;

public class Sab extends Sup
{
	private int p;
	private int q;
	private int ans;
	
	public void set(int x,int y)
	{
		this.p = x;
		this.q = y;
		ans = (p*q)+c;
		System.out.println("Answer : "+ans);
	}

}
