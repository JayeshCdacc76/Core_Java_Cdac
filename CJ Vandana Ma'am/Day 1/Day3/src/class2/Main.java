package class2;

public class Main {

	public static void main(String[] args) 
	{
		
		Test obj1 = new Test();
		
		obj1.set_data(10,20);
		obj1.show();
		
		Test obj2 = new Test();
		
		obj2.set_data(12,24);
		obj2.show();
		
		System.out.println("Maximum : ");
		
		if(obj1.comp()>obj2.comp())
		{
			obj1.show();
		}
		else
		{
			obj2.show();
		}

	}

}
