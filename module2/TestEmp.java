package module2;

public class TestEmp {
	public static void main(String[] args) 
	{
		Emp employee1 = new Emp();

		employee1.accept();

		Emp employee2 = new Emp();

		employee2.accept();

		System.out.println("------------------------------");
		System.out.println("Employee Information : ");
		System.out.println("------------------------------");

		employee1.display();
		employee1.completeProject();
		employee1.checkAttendance();
		employee1.applyLoan();
		System.out.println("------------------------------");

		employee2.display();
		employee2.completeProject();
		employee2.checkAttendance();
		employee2.applyLoan();
		System.out.println("------------------------------");

	}

}
