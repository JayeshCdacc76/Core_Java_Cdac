package module7;

class Stream
{
	private String type;
	private int fees;
	private int noOfStudent;
	
	
	public Stream(String type, int fees, int noOfStudent) {
		super();
		this.type = type;
		this.fees = fees;
		this.noOfStudent = noOfStudent;
	}


	@Override
	public String toString() {
		return "Stream [type=" + type + ", fees=" + fees + ", noOfStudent=" + noOfStudent + "]";
	}
		
}

class College
{
	private String name;
	private char grade;
	private String address;
	private String contactNo;
	
	
	public College(String name, char grade, String address, String contactNo) 
	{
		super();
		this.name = name;
		this.grade = grade;
		this.address = address;
		this.contactNo = contactNo;
	}


	@Override
	public String toString() {
		return "College [name=" + name + ", grade=" + grade + ", address=" + address + ", contactNo=" + contactNo + "]";
	}
	
}

public class TestCollege {

	public static void main(String[] args) {
		
		College college = new College("MET",'A',"Nashik","1234 56 78");
				
		Stream stream1 = new Stream("Computer",100000,80);
		Stream stream2 = new Stream("Mechanical",90000,60);
		Stream stream3 = new Stream("Civil",50000,90);
		
		System.out.println(college);
		System.out.println(stream1);
		System.out.println(stream2);
		System.out.println(stream3);
	}

}
