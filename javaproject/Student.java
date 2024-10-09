package javaproject;


public class Student extends person{
protected int rollNo,score;
protected String stream;
public Student(String name, String gender, int age, int rollNo, int score, String stream) {
	super(name, gender, age);
	this.rollNo = rollNo;
	this.score = score;
	this.stream = stream;
}
 void fun2() {
	 super.fun1();
	 System.out.println("display student details");
 }
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", score=" + score + ", stream=" + stream + ", name=" + name + ", gender="
			+ gender + ", age=" + age + "]";
}

}
 
 
 
 
	

