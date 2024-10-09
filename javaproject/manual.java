package javaproject;

public class manual extends automatic {

	protected boolean hasClutch;

	public manual(int year, String model, int price, String color, int modes, int noGears, boolean hasClutch) {
		super(year, model, price, color, modes, noGears);
		this.hasClutch = hasClutch;
	}
 void fun1() {
	 System.out.println("the details ar folows");
 }
	@Override
	public String toString() {
		return "manual [hasClutch=" + hasClutch + ", modes=" + modes + ", noGears=" + noGears + ", year=" + year
				+ ", model=" + model + ", price=" + price + ", color=" + color + "]";
	}
	
}
