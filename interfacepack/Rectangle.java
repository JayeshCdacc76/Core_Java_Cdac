package interfacepack;

public class Rectangle implements Graphic {
	
	private float length;
	private float breath;
	
	public Rectangle(float length, float breath) {
		super();
		this.length = length;
		this.breath = breath;
	}
	
	public float area()
	{
		return(length*breath);
	}
	
	public float perimeter()
	{
		return(2*(length+breath));
	}
}
