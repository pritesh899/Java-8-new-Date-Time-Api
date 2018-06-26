import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeAPI {

	public static void main(String[] args) {
		LocalDateTimeAPI object = new LocalDateTimeAPI();
		object.TestDate();

	}
	
	public void TestDate(){
		System.out.println("--------------------------------------------------");
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Local Date Time : " + dateTime);
		
		System.out.println("--------------------------------------------------");
		LocalDate localDate = dateTime.toLocalDate();
		System.out.println("Local Date : " + localDate);
		
		System.out.println("--------------------------------------------------");
		int date = dateTime.getDayOfMonth();
		System.out.println("Local Date : " + date);
		
		System.out.println("--------------------------------------------------");
		Month month = dateTime.getMonth();
		System.out.println("Local Month : " + month);
		
		System.out.println("--------------------------------------------------");
		int year = dateTime.getYear();
		System.out.println("Local Year : " + year);
		
		System.out.println("--------------------------------------------------");
		DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
		System.out.println("Day of the week : " + dayOfWeek);
		
		System.out.println("--------------------------------------------------");
		int hour = dateTime.getHour();
		if(hour>12)
		{
			hour = hour%12;
		}
		int minutes = dateTime.getMinute();
		int seconds = dateTime.getSecond();
		System.out.println("hour :" + hour + " minutes :" + minutes + " seconds :" + seconds );
		
		System.out.println("--------------------------------------------------");
		LocalDateTime localDateTime = dateTime.withDayOfMonth(1);
		System.out.println("With day of the month :"+localDateTime);
		
	}

}
