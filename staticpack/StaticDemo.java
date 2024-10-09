package staticpack;

public class StaticDemo
{
	static int  num = 1;
	
	public void display()
	{
		num++;
		
		System.out.println(num);
	}

	public static void main(String[] args) {

//		System.out.println(num);		
//		System.out.println(StaticDemo.num);
		
		StaticDemo obj1 = new StaticDemo();	
		obj1.display();
		
		StaticDemo obj2 = new StaticDemo();	
		obj2.display();
		
		StaticDemo obj3 = new StaticDemo();	
		obj3.display();
	}

}
