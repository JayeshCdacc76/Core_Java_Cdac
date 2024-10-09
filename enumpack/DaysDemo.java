package enumpack;

enum Days
{
	MON,TUE,WED,THU,FRI,SAT,SUN;
}

public class DaysDemo {

	public static void main(String[] args) {
		
		System.out.println("Using Enhance Loop : ");
		
		for (Days a : Days.values())
		{
			System.out.println(a);
		}
		
		System.out.println("--------------");
		
		Days d = Days.TUE;
		
		switch(d)
		{
			case MON:
				System.out.println("Monday");
				break;
			
			case TUE:
				System.out.println("Tuseday");
				break;
			
			case WED:
				System.out.println("Wensday");
				break;
			
			case THU:
				System.out.println("Thursday");
				break;
			
			case FRI:
				System.out.println("Friday");
				break;
			
			case SAT:
				System.out.println("Saturday");
				break;
			
			case SUN:
				System.out.println("Sunday");
				break;
			
		}
		
	}

}
