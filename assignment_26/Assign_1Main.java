/*
  	Write a program that checks if a person is eligible for a loan based on their age 
  	and income.
	Requirements:
    A person is eligible if their age is between 18 and 60 and their income is above $25,000.
    Use logical && to combine these conditions.
*/

package assignment_26;

public class Assign_1Main {

	public static void main(String[] args) 
	{
		Assign_1 loan = new Assign_1();
		
		loan.accept();
		loan.display();
		loan.checkLoan();

	}

}
