package javaproject;
import java.util.*;
public  class person {
protected String name,gender;
protected int age;
public person(String name, String gender, int age) {
	//super();
	this.name = name;
	this.gender = gender;
	this.age = age;
}

public void fun1() {
	System.out.println("Display the dettails");
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
}


}

