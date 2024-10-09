package collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Character,String> hashmap = new HashMap<Character,String>();
		
		hashmap.put('J', "Jayesh");
		hashmap.put('V', "Vaibhav");
		hashmap.put('M', "Mahavir");
		hashmap.put(null, "Yash");
		hashmap.put(null, "Jay");     // only one null value is allowed to show
		hashmap.put('K', null);
		hashmap.put('R', null);
		
		System.out.println(hashmap);
		System.out.println("--------------------------------------------------------------");
		
		boolean res = hashmap.containsKey('J');
		System.out.println(res);
		System.out.println("--------------------------------------------------------------");
		
		hashmap.remove('V');
		
		hashmap.replace('R', null,"Rohit");
		System.out.println(hashmap);
		System.out.println("--------------------------------------------------------------");
		
		Object[] keys = hashmap.keySet().toArray();
		
		System.out.println("keys:");
		
		for(int i=0;i<keys.length;i++)
		{
			System.out.print(keys[i]+" ");
			System.out.println(hashmap.get(keys[i]));
		}
		System.out.println("--------------------------------------------------------------");
	}

}
