/*
  Assignment 3: Door Access Control
  Write a program that simulates an access control system. A person is allowed access
   if they have both a valid ID and a valid access card, or if they are an admin.
  Requirements:
• Use logical operators &&, ||, and !
 */

package assignment_26;

public class Assign_3 {

	public static void main(String[] args) {
		
		boolean admin =true;
		boolean validId = false;
		boolean validCard = false;
		
		if(validCard==true && validId ==true || admin==true)
		{
			System.out.println("Access Granted");
		}
		else
		{
			System.out.println("Access Denined");
		}
	}

}
