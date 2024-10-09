package Product;

public class Main 
{
	public static void main(String[] args) 
	{	
		Clas ob[]=new Clas[3];
		
		for(int i=0;i<3;i++)
		{	
			ob[i] = new Clas();
			ob[i].accept();
		}
		
		System.out.println("-----------------------------------");
		
		for(int i=0;i<3;i++)
		{
			ob[i].calculate();
			ob[i].show();
		}
		
	}
}