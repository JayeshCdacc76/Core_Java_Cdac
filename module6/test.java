package module6;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno,score,name");
		int RollNo=sc.nextInt();
		String name=sc.next();
		double score=sc.nextDouble();
		
		Student student=new Student();
		student.setRollNo(RollNo);
		student.setName(name);
		student.setScore(score);
		//student.display();
		
		Student student3=new Student();
		//student3.display();
		Student student2=new Student(73,"yash",99);
		//student2.display();
	
	System.out.println("Enter the name ");
	String name1=sc.next();
	student2.setName(name1);
	System.out.println("new name is  ="+student2.getName());
	}

}
