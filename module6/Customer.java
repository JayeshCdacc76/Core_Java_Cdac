package module6;

public class Customer {
	private int custid;
	private String name;
	private int mobile;
	private String address;

	public Customer() {
		super();

		custid = 0;
		name = "";
		mobile = 00000000000;
		address = "";
	}

	public Customer(int custid, String name, int mobile, String address) {
		this.custid = custid;
		this.name = name;
		this.mobile = mobile;
		this.address = address;

	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", mobile=" + mobile + ", address=" + address + "]";
	}

	
}
