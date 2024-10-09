package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer>tree1=new TreeSet<Integer>();
	    //TreeSet<Integer>tree1=new TreeSet<>();
		
		tree1.add(20);
		tree1.add(10);
		tree1.add(77);
		tree1.add(158);
		
		System.out.print("Using SOP :");
	
		System.out.println(tree1);
		
		System.out.println("--------------------------------");
		
		Iterator itr = tree1.iterator();
		
		System.out.println("Using Iterator : ");
		
		while (itr.hasNext()) {
			System.out.println(itr.next()); 
		}
		System.out.println("--------------------------------");
		
		System.out.println("Using Loop : ");
		for(int i : tree1)
		{
			System.out.println(i);
		}
		System.out.println("--------------------------------");
		
		tree1.remove(10);
		
		System.out.println("First : "+tree1.first());
		System.out.println("Last  : "+tree1.last());
		
		tree1.clear();
		
		System.out.println(tree1.isEmpty());
		
	}

}
