package Utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class Helper {
	
	 public static int generateRandomNumber(int min, int max)
	    {
	    	Random random = new Random();
	        return random.nextInt(max - min + 1) + min;
	    }

	 public static Date generateRandomDate(int daysRange) {
	        Calendar calendar = new GregorianCalendar();
	       calendar.setTime(new Date()); // Set the calendar to today's date
	        
	        Random random = new Random();
	        int randomDays = random.nextInt(daysRange); // Generate a random number of days within the range
	        
	        calendar.add(Calendar.DAY_OF_YEAR, randomDays); // Add the random number of days
	        
	        return calendar.getTime(); // Get the generated random date
	    }
	 
	 public static String formatDate(Date date, String format) {
	        SimpleDateFormat sdf = new SimpleDateFormat(format);
	        return sdf.format(date);
	    }
}
