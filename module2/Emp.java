package module2;

import java.util.Scanner;

public class Emp 
{
	 private int empId;
	 private String empName;
     private double empSalary;
     
     public void accept()
     {
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.print("Enter Emp Id : ");
    	 empId = sc.nextInt();
    	 
    	 System.out.print("Enter Name   : ");
    	 empName = sc.next();
    	 
    	 System.out.print("Enter Salary : ");
    	empSalary = sc.nextDouble();
    	 
     }
     
     public void display()
     {
 		System.out.println("Emp Id  : "+empId);
 		System.out.println("Emp Name: "+empName);
 		System.out.println("Salary  : "+empSalary);
     }
     
     public void completeProject()
     {
    	 System.out.println("Project is Complete");
     }
     
     public void checkAttendance()
     {
    	 System.out.println("Good Attendance");
     }
     
     public void applyLoan()
     {
    	 if(empSalary>50000)
    	 {
    		 System.out.println("Eligible for Loan");
    	 }
    	 else
    	 {
    		 System.out.println("Not Eligible for Loan");
    	 }
     }
}
