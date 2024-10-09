package collection;

public class Emp {
	
	private int empId;
	private String ename;
	private double salaray;
	
	public Emp()
	{
		this.empId = 0;
		this.ename = null;
		this.salaray=0.0;
	}
	
	public Emp(int empId, String ename, double salaray) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salaray = salaray;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalaray() {
		return salaray;
	}

	public void setSalaray(double salaray) {
		this.salaray = salaray;
	}

	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", salaray=" + salaray + "]";
	}
	
}
