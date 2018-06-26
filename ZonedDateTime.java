import java.time.ZoneId;

public class ZonedDateTime {

		   public static void main(String args[]) {
			   ZonedDateTime java8tester = new ZonedDateTime();
		      java8tester.testZonedDateTime();
		   }
			
		   public void testZonedDateTime() {
				
		      ZoneId id = ZoneId.of("Europe/Paris");
		      System.out.println("ZoneId: " + id);
				
		      ZoneId currentZone = ZoneId.systemDefault();
		      System.out.println("CurrentZone: " + currentZone);
		   }
}
