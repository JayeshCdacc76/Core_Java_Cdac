package module8;

public class StringBuilderDemo {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Jayesh");

		sb.insert(6, "new text");
		System.out.println(sb);
 
		sb.append(" - cdac nashik.");
		System.out.println(sb);

		int i = sb.indexOf("a");
		System.out.println("i is "+ i );	

		int i1=sb.lastIndexOf("v");
		System.out.println("i1 is "+ i1);

		sb.replace(6, 9, "new");
		System.out.println(sb);
		sb.delete(0, 5);

	}

}