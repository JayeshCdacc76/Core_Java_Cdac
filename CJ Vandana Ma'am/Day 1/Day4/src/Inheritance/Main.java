package Inheritance;

public class Main {
	
	public static void main(String[] args) 
	{
		Sup obj = new Sup();
		obj.display();
      //obj.show();        Super class not Access Member And Methods of Sab Class
		System.out.println("-----------------------------");
		
		Sab ob = new Sab();
		
		ob.show();
		ob.display();
	}
}
