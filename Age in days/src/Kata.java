
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
/**
 * Did you ever want to know how many days you are old? Write a function
 * ageInDays which returns your age in days.
 * For example if today is 30 November 2015 then
 * ageInDays(2015, 11, 1) returns "You are 29 days old" 
 * The birthday is entered as integers in the following order
 * ageInDays(year, month, day) 
 * For example if you are born 27 November 2007 then
 * call ageInDays(2007, 11, 27).
 * Your birthday is expected to be in the past.
 */
public class Kata {

	public static String ageInDays(int year, int month, int day) {

		LocalDate date1 = LocalDate.of(year, month, day);
		LocalDate date2 = LocalDate.now();
		long numDays = DAYS.between(date1, date2);
		return "You are " + numDays + " days old";
	}

//	public static String ageInDays(final int y, final int m, int d) {
//	    return String.format("You are %d days old", LocalDate.now().toEpochDay() - LocalDate.of(y, m, d).toEpochDay());
//	  }

	public static void main(String[] args) {
		System.out.println(ageInDays(2018, 12, 18));
	}
}

/
