package interfacepack;

public class TestGraphic {

	public static void main(String[] args) {

		Circle circle = new Circle(10.6f);

		System.out.println("Area of Circle         : " + circle.area());
		System.out.println("Perimeter of Circle    : " + circle.perimeter());

		System.out.println("---------------------------------------");

		Rectangle rectangle = new Rectangle(11.6f, 21.7f);

		System.out.println("Area of Rectangle      : " + rectangle.area());
		System.out.println("Perimeter of Rectangle : " + rectangle.perimeter());

		System.out.println("---------------------------------------");
	}

}
