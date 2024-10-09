package Product;

import java.util.Scanner;

public class Clas {
	
	private final String name="Pendrive";
	private int quantity;
	private int amount;
	private final int rate=500;
	
	public Clas() {

		this.quantity = 0;
	
	}

	public Clas(int quantity) {

		this.quantity = quantity;
		
	}

	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter The Product name: ");
//		name = sc.next();
		
		System.out.print("Enter The Product Quantity: ");
		quantity = sc.nextInt();
		
//		rate = 500;
	}
	
	public void calculate()
	{
		amount = rate * quantity;
	}
	
	public void show()
	{
		System.out.println(name +" Quantity " +quantity +" Rate is : "+amount);
	}
}
