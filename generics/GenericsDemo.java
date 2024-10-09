package generics;

class Myclass
{
	public <E> void printArray(E[] arr) 
	{
		for(E i : arr)
		{
			System.out.println(i);
		}
		System.out.println("------------------");
	}
}

public class GenericsDemo {

	public static void main(String[] args) {
		
		Myclass myclass  =new Myclass();
		
		System.out.println("Interger Array : ");
		
		Integer[] arrInt = {11,22,33,44,55};
		myclass.printArray(arrInt);
		
		System.out.println("Double Array : ");
		
		Double[] arrDouble = {10.22,77.66,3.14,88.11,99.1};
		myclass.printArray(arrDouble);
		
		System.out.println("Float Array : ");
		
		Float[] arrFloat = {15.22f,7.66f,32.4f,84.17f,98.85f};
		myclass.printArray(arrFloat);
		
		System.out.println("Character Array : ");
		
		Character[] arrCharacter = {'J','A','Y','E','S','H'};
		myclass.printArray(arrCharacter);
		
	}

}
