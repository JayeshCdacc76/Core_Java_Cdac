package Date;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateDemo4 {

	public static void main(String[] args) {

		Date d = new Date();
		
		System.out.println(d);
		
		TimeZone tz = TimeZone.getTimeZone("IST");
		Calendar cal = Calendar.getInstance(tz);
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int doy = cal.get(Calendar.DAY_OF_WEEK);
		int dow = cal.get(Calendar.DAY_OF_YEAR);
		int m = cal.get(Calendar.MONTH);
		int n = cal.get(Calendar.YEAR);
		int h = cal.get(Calendar.HOUR);
		int y = cal.get(Calendar.MINUTE);
		

		System.out.println("Day : "+day);
		System.out.println("Day : "+doy);
		System.out.println("Day : "+dow);
		
		System.out.print(h+":");
		System.out.print(y+"-");
		System.out.print(day+"/");
		System.out.print(m+"/");
		System.out.print(n);		
	}

}
