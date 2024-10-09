package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList arrList = new ArrayList();

		arrList.add(10);
		arrList.add(23.67);
		arrList.add("Yash");
		arrList.add("Jayesh");
		arrList.add("Jay");
		arrList.add("Yash");

		Emp emp1 = new Emp(1, "Jayesh", 70000);
		Emp emp2 = new Emp(2, "Jay", 60000);

		arrList.add(emp1);
		arrList.add(emp2);

		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
			System.out.println("----------------------------------------------------");
		}

		System.out.println("Using the iterator method");

		Iterator itr = arrList.iterator();

		while (itr.hasNext()) { // return true or false
			System.out.println(itr.next()); // return object
		}
		System.out.println("----------------------------------------------------");

		boolean res = arrList.contains("Jayesh");  // check object is present or not
		System.out.println(res);

		int res1 = arrList.indexOf("Yash");
		System.out.println("index of : " + res1);

		int res2 = arrList.lastIndexOf("Yash");
		System.out.println("last index of : " + res2);
		System.out.println("----------------------------------------------------");

		arrList.remove(0); 							// using the index

		System.out.println("After Using Remove : ");

		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
			System.out.println("----------------------------------------------------");
		}

		arrList.clear();

		System.out.println("Empty : " + arrList.isEmpty());		
	}

}
