package enumpack;

interface Interface1
{
	String name ="OFS";
	public void fun1();
}

enum Month implements Interface1{
	
	JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;
	
	public void fun1()
	{
		System.out.println("Fun1");
	}
	
}

public class EnumDemo1 {

//	2nd Position
//	enum Month{
//		
//		JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;
//		
//	}

	public static void main(String[] args) {

//		3rd Position
//		enum Month {
//
//			JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;
//
//		}
		
//	  datatype  var      value
		Month   m1   =  Month.JAN;
		Month   m2   =  Month.FEB;
		Month   m3   =  Month.MAR;
		Month   m4   =  Month.APR;
		Month   m5   =  Month.MAY;
		Month   m6   =  Month.JUN;
		Month   m7   =  Month.JUL;
		Month   m8   =  Month.AUG;
		Month   m9   =  Month.SEP;
		Month   m10  =  Month.OCT;
		Month   m11  =  Month.NOV;
		Month   m12  =  Month.DEC;
		
		System.out.println("By Using Normal : ");
		
		System.out.println("m1  : "+m1);
		System.out.println("m2  : "+m2);
		System.out.println("m3  : "+m3);
		System.out.println("m4  : "+m4);
		System.out.println("m5  : "+m5);
		System.out.println("m6  : "+m6);
		System.out.println("m7  : "+m7);
		System.out.println("m8  : "+m8);
		System.out.println("m9  : "+m9);
		System.out.println("m10 : "+m10);
		System.out.println("m11 : "+m11);
		System.out.println("m12 : "+m12);
		
		System.out.println("--------------------------");
				
		System.out.println("By Using Enhance For Loop : ");
		
		for(Month m : Month.values())
		{
			System.out.println(m);
		}
		
		System.out.println("-------------------------");
			
		System.out.println(Month.JAN);	
		
		System.out.println("-------------------------");

//		Month month = new Month();      can not create Object of enum variable

	}

}
