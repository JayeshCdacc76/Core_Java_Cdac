package module6;

public class Student {

	private int RollNo;
	private String name;
	private double score;

	public Student() {
		//		System.out.println("this is a default con");
		RollNo = 10;
		name = "yash";
		score = 5054.548;
	}

	public Student(int rollNo, String name1, double score) {
		super();  //calls the parent call of the constructor
		RollNo = rollNo;
		this.name = name1;
		this.score = score;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	
	
	
//	public void display() {
//		System.out.println("RollNo: " + RollNo);
//		System.out.println("name: " + name);
//		System.out.println("score: " + score);
//	}

}
