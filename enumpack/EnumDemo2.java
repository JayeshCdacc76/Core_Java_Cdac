package enumpack;

enum Month1{
	
	JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;
}

public class EnumDemo2 {

	public static void main(String[] args) {
	
		Month1 m = Month1.JAN;
		
		switch(m)
		{
			case JAN:
				System.out.println("First Month");
				break;
				
			case FEB:
				System.out.println("Second Month");
				break;
				
			case MAR:
				System.out.println("Third Month");
				break;
				
			case APR:
				System.out.println("Fourth Month");
				break;
				
			case MAY:
				System.out.println("Fifth Month");
				break;
				
			case JUN:
				System.out.println("Sixth Month");
				break;
				
			case JUL:
				System.out.println("Seventh Month");
				break;
				
			case AUG:
				System.out.println("Eighth Month");
				break;
				
			case SEP:
				System.out.println("Ninth Month");
				break;
				
			case OCT:
				System.out.println("Teenth Month");
				break;
				
			case NOV:
				System.out.println("Eleventh Month");
				break;
				
			case DEC:
				System.out.println("Twelth Month");
				break;
				
		}

	}

}
