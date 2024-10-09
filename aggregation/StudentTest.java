package aggregation;

 class Address1 {
	
	String city,state,country;
	
	public Address1(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}

class Name1
{
	String fname,mname,lname;

		public Name1(String fname, String mname, String lname) {
			super();
			this.fname = fname;
			this.mname = mname;
			this.lname = lname;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getMname() {
			return mname;
		}

		public void setMname(String mname) {
			this.mname = mname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}
				
	}

 class Student {

	private int rollNo;
	Name1 name;
	Address1 address;
	
		public Student(int rollNo, Name1 name, Address1 address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
		
		public int getRollNo() {
			return rollNo;
		}

		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}

		public Name1 getName() {
			return name;
		}

		public void setName(Name1 name) {
			this.name = name;
		}

		public Address1 getAddress() {
			return address;
		}

		public void setAddress(Address1 address) {
			this.address = address;
		}

		public void display()
		{
			System.out.println("RollNo      : "+rollNo);
			System.out.println("First Name  : "+name.fname);
			System.out.println("Middle Name : "+name.mname);
			System.out.println("Last Name   : "+name.lname);
			System.out.println("City        : "+address.city);
			System.out.println("State       : "+address.state);
			System.out.println("Country     : "+address.country);
		}
	}

public class StudentTest {

	public static void main(String[] args) {
		
		Address1 adderess1 = new Address1("AhmedNagar","Maharastra","India");
		Address1 adderess2 = new Address1("Chh.Shambhajinagar","Maharastra","India");
		Address1 adderess3 = new Address1("Pune","Maharastra","India");
		
		Name1 name1= new Name1("Jayesh","Ramesh","Bhor");
		Name1 name2= new Name1("Vaibhav","Gunvant","Gurav");
		Name1 name3= new Name1("Mahavir","V","Navalakha");
		
		Student student1 =new Student(101,name1,adderess1);
		Student student2 =new Student(102,name2,adderess2);
		Student student3 =new Student(103,name3,adderess3);
		
		student1.display();
		System.out.println("--------------------------------");
		student2.display();
		System.out.println("--------------------------------");
		student3.display();
		System.out.println("--------------------------------");

	}

}
