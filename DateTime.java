package javadsa;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

public class DateTime {

	public static String getDay(String day, String month, String year) {
//       The valueOf method returns the relevant Number
//		Object holding the value of the argument passed.
	
		int d = Integer.valueOf(day);
        int m = Integer.valueOf(month);
        int y = Integer.valueOf(year);

        //        this is used to store the date month and year
        LocalDate date = LocalDate.of(y, m, d);

        
//        The toString() method returns the string representation of the object. 
//       getDayOfweek here is used to return the day of that date of week
        return date.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        String day   = sc.next();
        String year  = sc.next();
      String days=  getDay(day,month,year);
        
        System.out.println(days);
    }
}