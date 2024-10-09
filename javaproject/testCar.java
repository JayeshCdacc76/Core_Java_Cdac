package javaproject;

public class testCar {
	public static void main(String[] args) {
		Car car = new Car(2024, "audi", 500000, "red");
		System.out.println("" + car);

		System.out.println("******************************************");
		manual obj = new manual(2014, "audi", 58584, "black", 3, 7, true);
		System.out.println(obj);
		System.out.println("*******************************************");

		automatic obj2 = new automatic(2024, "wolkswagen", 5000000, "white", 3, 7);
		System.out.println("the details of the automatatic" + obj2);

		System.out.println("****************************");
		System.out.println("jalne wale jalte rahenge jalana unka kaam jaa jala kr rakh kardunga \n** mahaveer mera naam **");
	}
}
