package module2;

public class TestStudent 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();		
		s1.accept();
			
		Student s2 = new Student();		
		s2.accept();
		
		Student s3 = new Student();
		s3.accept();
		
		System.out.println("----------------------------");
		System.out.println("Student Information : ");
		System.out.println("----------------------------");
		
		s1.display();
		s1.completeAssignment();
		s1.attendClass();
		s1.apperExam();
		System.out.println("----------------------------");
		
		s2.display();
		s2.completeAssignment();
		s2.attendClass();
		s2.apperExam();
		System.out.println("----------------------------");
		
		s3.display();
		s3.completeAssignment();
		s3.attendClass();
		s3.apperExam();
		System.out.println("----------------------------");
	}

}
