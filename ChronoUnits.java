import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnits {

	public static void main(String[] args) {
		ChronoUnits object =  new ChronoUnits();
		object.Chronos();
	}

	public void Chronos(){
		
		
		LocalDate today = LocalDate.now();
		System.out.println("Date : "+today);
		
		System.out.println("--------------------------------------------------");
		//Adding 1 days
		LocalDate date = today.plusDays(1);
		System.out.println("Date : "+ date + " | Added 1 day");

		System.out.println("--------------------------------------------------");
		//Subtracting 1 day
		LocalDate date1 = today.minusDays(1);
		System.out.println("Date : "+ date1 + " | Subtracted 1 day");
		
		System.out.println("--------------------------------------------------");
		//Adding 1 month
		LocalDate date2 = today.plusMonths(1);
		System.out.println("Date : "+ date2 + " | Added 1 month");
		
		System.out.println("--------------------------------------------------");
		//Subtracting 1 month
		LocalDate date3 = today.minusMonths(1);
		System.out.println("Date : "+ date3 + " | Added 1 month");
		
		System.out.println("--------------------------------------------------");
		//Subtracting 1 year
		LocalDate date4 = today.minusYears(1);
		System.out.println("Date : "+ date4 + " | Subtracted 1 year");
		
		System.out.println("--------------------------------------------------");
		//adding 1 year
		LocalDate date5 = today.plusYears(1);
		System.out.println("Date : "+ date5 + " | Added 1 year");
		
		System.out.println("--------------------------------------------------");
		//adding 1 week
		LocalDate date6 = today.plusWeeks(1);
		System.out.println("Date : "+ date6 + " | Added 1 week");
		
		System.out.println("--------------------------------------------------");
		//Subtracting 1 week
		LocalDate date7 = today.minusWeeks(1);
		System.out.println("Date : "+ date7 + " | Subtracting 1 week");
		
		System.out.println("--------------------------------------------------");
		//Subtracting 1 week
		LocalDate date8 = today.plus(1, ChronoUnit.WEEKS);;
		System.out.println("Date : "+ date8 + " | Subtracting 1 week");

		
		
		
		
	}
}
