package module6;

public class testCustomer {

	public static void main(String[] args) {
		Customer customer=new Customer();
//		System.out.println("Customer :"+customer.getCustid());
//		System.out.println("name  :"+customer.getName());
//		
//		System.out.println("mobile :"+customer.getMobile());
//		
//		System.out.println("address :"+customer.getAddress());
//		sys
		System.out.println(customer );
System.out.println("------------------------------------------------------");
	
	Customer customer2=new Customer(01,"VIGNEH",666666,"LOCAL--+");
	System.out.println("Displaying Details.....\n");
//System.out.println("Customer :"+customer2.getCustid());
//System.out.println("name  :"+customer2.getName());
//
//System.out.println("mobile :"+customer2.getMobile());
//
//System.out.println("ADDRESS :"+customer2.getAddress());
	System.out.println(customer2);
	}

}
