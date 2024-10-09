package StaticNested;

class OuterClass {

	private static String msg = "Welcome To Nested Class";

	public static class NestedStaticClass {
		public void printMessage() {
			System.out.println("Message from Nested Static Class" + msg);
		}
	}

	public class InnerClass {

		public void display() {
			System.out.println("Message from Non-Static Member" + msg);
		}
	}
}

public class ClassNested {

	public static void main(String[] args) {

		OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
		printer.printMessage();

		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();

		inner.display();
	}

}
