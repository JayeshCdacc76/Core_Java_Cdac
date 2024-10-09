package module7;

class Shape {
	public void calArea(String shape, int a, int b) {
		System.out.println("calArea of Shape Class");
	}

	public void display() {
		System.out.println("display of Shape Class");
	}

	public void fun1() {
		System.out.println("fun1 of Shape Class");
	}
}

class Rectangle extends Shape {
	public void calArea(String shape, int a, int b) {
		System.out.println("Area : " + (a * b));
	}

	public void display() {
		super.display();
		super.fun1();
	}
}

public class OverRiding {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.calArea("shape", 10, 20);
		shape.display();

		System.out.println("==========================");

		Rectangle rect = new Rectangle();
		rect.calArea("rect", 20, 20);
		rect.display();

		System.out.println("==========================");

		shape = new Rectangle();
		shape.calArea("rect", 10, 10);
		shape.display();

	}
}
