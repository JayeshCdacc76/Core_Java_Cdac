package javaproject;

public class Car {
protected int year;
protected String model;
protected int price;
protected String color;
public Car(int year, String model, int price, String color) {
	super();
	this.year = year;
	this.model = model;
	this.price = price;
	this.color = color;
}
void fun1() {
	System.out.println("the details are the folows");
}
@Override
public String toString() {
	return "Car [year=" + year + ", model=" + model + ", price=" + price + ", color=" + color + "]";
}

}
