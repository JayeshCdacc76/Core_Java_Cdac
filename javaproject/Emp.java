package javaproject;

public class Emp extends Student{
protected int empNo,salary;
protected String company;
protected Emp(String name, String gender, int age, int rollNo, int score, String stream, int empNo, int salary,
		String company) {
	super(name, gender, age, rollNo, score, stream);
	this.empNo = empNo;
	this.salary = salary;
	this.company = company;
}

@Override
public String toString() {
	return "Emp [empNo=" + empNo + ", salary=" + salary + ", company=" + company + ", rollNo=" + rollNo + ", score="
			+ score + ", stream=" + stream + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
}


}
