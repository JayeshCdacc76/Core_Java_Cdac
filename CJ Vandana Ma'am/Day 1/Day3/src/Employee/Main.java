package Employee;

public class Main 
{
	public static void main(String[] args) 
	{
		
		Emp ob1 = new Emp();
		
		ob1.set_data(101,"Jayesh",50000);	
		ob1.show_data();
		
		System.out.println("-----------------");
		
		Emp ob2 = new Emp();
		
		ob2.set_data(102,"Omkar",35000);
		ob2.show_data();
		
		System.out.println("-----------------");
		
		System.out.println("Maximum : ");
		
		if(ob1.comp()>ob2.comp())
		{
			ob1.show_data();
		}
		else
		{
			ob2.show_data();
		}

	}

}
