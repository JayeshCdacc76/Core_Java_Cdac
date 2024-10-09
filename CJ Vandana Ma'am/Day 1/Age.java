import java.util.Scanner;

class Age{
	public static void main(String args[]){
	
	int age;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Age: ");
	age = sc.nextInt();

		if(age>0 && age<=17)
			System.out.println("Minor.");
		else if (age>17 && age<=65)
			System.out.println("Major ");
		else if(age>65 && age<100)
			System.out.println("Senior Citizen");
		else 
			System.out.print("Invlid age"); 

	}
}