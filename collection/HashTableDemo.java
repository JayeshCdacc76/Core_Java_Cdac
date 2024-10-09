package collection;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
	
		Hashtable<Character,String>table1= new Hashtable<Character,String>();
		
		table1.put('J', "Jay"    );
		table1.put('V', "Vaibhav");
		table1.put('M', "Mahavir");
		table1.put('Y', "Yash"   );
		table1.put('J', "Jayesh" );
		
		System.out.println(table1);
		
		System.out.println(table1.get('J'));
		System.out.println(table1.get('V'));
		System.out.println(table1.get('M'));
		System.out.println(table1.get('Y'));
		
	}

}
