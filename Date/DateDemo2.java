package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

	public static void main(String[] args) {
	
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd' at 'hh.mm.ss a");//to Format Data
		
		System.out.println("Date : "+sdf.format(d));
		//						  object   method
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy 'Year'");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM 'Month'");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd 'Day'");
		
		System.out.println("Date : "+sdf1.format(d));
		System.out.println("Date : "+sdf2.format(d));
		System.out.println("Date : "+sdf3.format(d));

	}

}
