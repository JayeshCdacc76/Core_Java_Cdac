package multithreading;

class Multithread2 implements Runnable{
	
	public void fun1()
	{
		System.out.println("Fun1");
	}
	
	public void fun2()
	{
		System.out.println("Fun2");
	}
	
	public void run()
	{
		Thread th = new Thread();
		
		fun1();
		fun2();	
		
		System.out.println("Id   : " + th.getId());
		System.out.println("Name : " + th.getName());
	}
}

public class MultiThreadingDemo2 {

	public static void main(String[] args) {
		
		Multithread2 obj1 = new Multithread2();
		
		Thread th1 = new Thread(obj1);	
		th1.start();
		
		Thread th2 = new Thread(obj1);	
		th2.start();

	}

}
