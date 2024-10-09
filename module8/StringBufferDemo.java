package module8;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("jayesh");

		sb.append(" Cdac nashik");
		System.out.println(sb);

		int i = sb.indexOf("a");
		System.out.println("i is "+ i );

		int i1=sb.lastIndexOf("v");
		System.out.println("i1 is "+ i1);		

		sb.replace(6, 9, "new");
		System.out.println(sb);
		sb.delete(0, 5);		

		System.out.println(sb);
    	System.out.println(sb.reverse());

	}

}