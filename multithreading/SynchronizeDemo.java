package multithreading;

class Myclass implements Runnable
{
	private static boolean flag = true;
	
	public synchronized void printEven()
	{
		long id = Thread.currentThread().getId();
		
		for(int i=2;i<20;i+=2)
		{
			System.out.println(i + " Id : "+id);
		}
		System.out.println("--------------");
	}
	
	public synchronized void printOdd()
	{
		long id = Thread.currentThread().getId();
		
		for(int i=1;i<20;i+=2)
		{
			System.out.println(i +" Id : "+id);
		}
		System.out.println("--------------");
	}
	
	public void run()
	{
		if(flag == true)
		{
			flag = false;
			printEven();
		}
		else
		{
			printOdd();
		}
	}
}

public class SynchronizeDemo {

	public static void main(String[] args) {
		
		Myclass myclass = new Myclass();
		
		Thread even = new Thread(myclass);
		even.start();
		
		Thread odd = new Thread(myclass);
		odd.start();
	}

}
