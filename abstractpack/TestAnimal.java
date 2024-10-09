package abstractpack;

abstract class Animal {

	int legs = 4;

	abstract public void sound();

	abstract public void fun1();

	abstract public void fun2();

	public void classInfo(String type) {
		System.out.println("I Belong to " + type + " has " + legs + " legs");
	}
}

class Dog extends Animal {

	public void sound() {
		System.out.println("The Dog Barks");
	}

	public void fun1() {
		System.out.println("In fun1 of Dog");
	}

	public void fun2() {
		System.out.println("In fun2 of Dog");
	}
}

class Lion extends Animal {

	public void sound() {
		System.out.println("The Lion Roar");
	}

	public void fun1() {
		System.out.println("In fun1 of Lion");
	}

	public void fun2() {
		System.out.println("In fun2 of Lion");
	}

}

public class TestAnimal {

	public static void main(String[] args) {

		Dog dog = new Dog();

		dog.classInfo("Dog");
		dog.sound();
		dog.fun1();
		dog.fun2();

		System.out.println("--------------------------------");

		Lion lion = new Lion();

		lion.classInfo("Lion");
		lion.sound();
		lion.fun1();
		lion.fun2();

		
		System.out.println("--------------------------------");
	}

}
