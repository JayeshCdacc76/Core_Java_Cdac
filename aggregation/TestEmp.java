package aggregation;

class Address
{
	String city,state,country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}		
}

class Emp
{
	int id;
	String name;
	Address address;
	
	public Emp(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("Id   : "+id);
		System.out.println("Name : "+name);
		System.out.println("City "+address.city + " and State is "+address.state + " and Country is "+address.country);
	}
}

public class TestEmp {

	public static void main(String[] args) {
		
		Address adderess1 = new Address("Nagar","Maharastra","India");
		Address adderess2 = new Address("Nashik","Maharastra","India");
		
		Emp emp1 =new Emp(101,"Jay",adderess1);
		Emp emp2 =new Emp(102,"Yash",adderess2);
		
		emp1.display();
		System.out.println("-----------------------------------------------------------");
		emp2.display();
		System.out.println("-----------------------------------------------------------");
	}

}
