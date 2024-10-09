package javaproject;

public class automatic extends Car {
protected int modes,noGears;

public automatic(int year, String model, int price, String color, int modes, int noGears) {
	super(year, model, price, color);
	this.modes = modes;
	this.noGears = noGears;
}
void fun1() {
	super.fun1();
	System.out.println("here are the deatils of the ");
}

@Override
public String toString() {
	return "automatic [modes=" + modes + ", noGears=" + noGears + ", year=" + year + ", model=" + model + ", price="
			+ price + ", color=" + color + "]";
}



}
