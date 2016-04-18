

import java.time.LocalDateTime;



public class DateTimeExample {
	
	
	public static void main(String args[])
	{
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime :"+localDateTime);
		System.out.println("Year :"+localDateTime.getYear());
		System.out.println("Month :"+localDateTime.getMonth());
		System.out.println("Day :"+localDateTime.getDayOfMonth());
		System.out.println("Hour :"+localDateTime.getHour());
		
	}

}
