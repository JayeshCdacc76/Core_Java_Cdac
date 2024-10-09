package collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		// ArrayList arrList = new ArrayList();
		ArrayList<Emp> arrList = new ArrayList<Emp>();

		Emp emp1 = new Emp(1, "Jayesh", 70000);
		Emp emp2 = new Emp(2, "Jay", 60000);
		Emp emp3 = new Emp(3, "yash", 50000);
		Emp emp4 = new Emp(4, "Vivek", 40000);
		Emp emp5 = new Emp(5, "Adesh", 30000);

		arrList.add(emp1);
		arrList.add(emp2);
		arrList.add(emp3);
		arrList.add(emp4);
		arrList.add(emp5);

		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
			System.out.println("----------------------------------------------------");
		}
	}

}
