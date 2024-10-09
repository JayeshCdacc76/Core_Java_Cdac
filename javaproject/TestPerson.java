package javaproject;

public class TestPerson {
public static void main(String[] args) {
	
	person arr[]=new person[3];
//for(int i =0;i<3;i++) {
		arr[0]=new person("mahaveer", "shemale", 55);
		arr[1]=new person("veer", "shemale", 40);
		arr[2]=new person("vaibhav", "male",45);
		
	
for(int i =0;i<3;i++) {
	System.out.println(arr[i]);
}
}
}
	
//	person obj=new person("vrushabh","female",25);
//	System.out.println(obj);
	
//	obj.fun1();
//	System.out.println(obj);
//	
//	System.out.println("********************************");
//	
//	Student student=new Student("saurabh", "male", 25, 2, 90, "computer");
//	System.out.println(student);
//	
//     System.out.println("****************************************");
//        Emp emp=new Emp(null, null, 0, 0, 0, null, 0, 0, null);    



