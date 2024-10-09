package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {

	public static void main(String[] args) {

Date d = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd'/'MM'/'yyyy");	
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd' 'MMM' 'yyyy");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd' 'MMM' 'yyyy 'Time 'a");
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd' 'MMMM' 'yyyy");
		
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		System.out.println(sdf4.format(d));
		
	}

}
