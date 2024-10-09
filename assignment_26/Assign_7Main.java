/*
 Assignment 7: Weather Conditions
 Write a program that determines whether it's safe to go outside based on temperature and weather conditions. The conditions to go outside are:
 Temperature should be between 20°C and 30°C.
 It should not be raining.
 Requirements:
 Use logical operators && and !
*/

package assignment_26;

public class Assign_7Main {

	public static void main(String[] args) {
		
		Assign_7 whether = new Assign_7();
		
		whether.accept();
		whether.display();
		whether.check();

	}

}
