package multithreading;

class Demo
{
	public void fun1()
	{
		System.out.println("Fun1");
	}
	
	public void fun2()
	{
		System.out.println("Fun2");
	}
}

class MultiThread extends Thread {
	
	Demo demo1 = new Demo();
	
	public void run() {
		
		demo1.fun1();
		demo1.fun2();
		
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();

		System.out.println("Id   : " + id);
		System.out.println("Name : " + name);
	}
}

public class MultiThreadingDemo {

	public static void main(String[] args) {

//		MultiThread thread1 = new MultiThread();
//		thread1.start();
//
//		MultiThread thread2 = new MultiThread();
//		thread2.start();
//
//		MultiThread thread3 = new MultiThread();
//		thread3.start();
		
		for(int i=0;i<5;i++)
		{
			MultiThread thread = new MultiThread();
			thread.start();			
		}
		

	}

}
