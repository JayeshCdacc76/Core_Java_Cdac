package enumpack;

public class EnumDemo3 {
	
	enum Month1{
		
		JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;
		int noMonth = 12;
		
		public int noMonths()
		{
			return noMonth;
		}
	}

	public static void main(String[] args) {
			
		Month1 m = Month1.JAN;
		
		System.out.println("Month : "+m);
		System.out.println("Price : "+m.noMonths());
	}

}
