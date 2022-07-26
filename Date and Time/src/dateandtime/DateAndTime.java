package dateandtime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateAndTime {

	public static void main(String[] args) {
		
		//JAVA LOCAL DATE CLASS
		//date in ISO format (YYYY-MM-DD) without time
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		//To add one or two day(s)
		LocalDate tomorrow = localDate.plusDays(1);
		System.out.println(tomorrow);
				
		//subtracts one month from the current date
		LocalDate previousMonth = LocalDate.now().minusMonths(2);
		System.out.println(previousMonth);
		
		//used to combine this date with a time to create a LocalDateTime
		LocalDateTime localDateTime = localDate.atTime(23, 05);
		System.out.println(localDateTime);
		
		//used to compares this date to another date
		System.out.println(localDate.compareTo(previousMonth));
		
		//used to check if this date is equal to another date
		System.out.println(localDate.equals(localDate));
		System.out.println(localDate.equals(previousMonth));
		
		//used to format this date using the specified formatter
		System.out.println(localDate.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(localDate.format(DateTimeFormatter.ISO_DATE));
		
		//System.out.println(int getDayOfMonth());
		
		/*
		 * //LocalDate representing a specific day, month and year by using the of
		 * method or the parse method LocalDate localDateOf = LocalDate.of(2020, 03,
		 * 14); System.out.println(localDateOf); LocalDate localDateParse =
		 * LocalDate.parse("2022-03-14"); System.out.println(localDateParse);
		 * 
		 * //the current date and subtracts one month with same date LocalDate
		 * previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		 * System.out.println(previousMonthSameDay);
		 * 
		 * //to use input and get the day of the week and day of the month DayOfWeek
		 * dayOfTheWeek = LocalDate.now().getDayOfWeek();
		 * System.out.println(dayOfTheWeek); DayOfWeek dayOfTheWeek2 =
		 * LocalDate.parse("2022-07-29").getDayOfWeek();
		 * System.out.println(dayOfTheWeek2);
		 * 
		 * //to check whether this year is a leap year or not boolean leapYear =
		 * LocalDate.now().isLeapYear(); System.out.println(leapYear); //to check
		 * whether the given year is a leap year or not boolean leapYear2020 =
		 * LocalDate.parse("2020-03-14").isLeapYear(); System.out.println(leapYear2020);
		 * 
		 * //isBefore and isAfter function boolean isBefore =
		 * LocalDate.parse("2020-05-23").isBefore(LocalDate.parse("2020-05-24"));
		 * boolean isAfter =
		 * LocalDate.parse("2020-05-23").isAfter(LocalDate.parse("2020-05-24"));
		 * System.out.println(isBefore); System.out.println(isAfter);
		 * 
		 * LocalDateTime beginningOfTheDay =
		 * LocalDate.parse("2022-06-29").atStartOfDay();
		 * System.out.println(beginningOfTheDay); LocalDate firstDayOfMonth =
		 * LocalDate.parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth());
		 * System.out.println(firstDayOfMonth);
		 * 
		 * //Local Time LocalTime now = LocalTime.now(); System.out.println(now);
		 * 
		 * //Using parse input and printing the local time LocalTime max =
		 * LocalTime.MAX; LocalTime seventhirty = LocalTime.parse("07:30:26");
		 * System.out.println(max); System.out.println(seventhirty); LocalTime
		 * seventhirtytwo = LocalTime.of(07, 32, 27, 9087967);//nanoseconds means having
		 * the value of 9 indexes System.out.println(seventhirtytwo);
		 * 
		 * //Adding hours and minutes to the given time LocalTime eightthirty =
		 * LocalTime.parse("06:30:26").plusHours(2); LocalTime sixthirtyfive =
		 * LocalTime.parse("06:30:26").plus(5, ChronoUnit.MINUTES);
		 * System.out.println(eightthirty); System.out.println(sixthirtyfive);
		 * 
		 * //To get the hour for the given time int six =
		 * LocalTime.parse("06:30:25").getHour(); System.out.println(six);
		 * 
		 */
		
		
	}

	private static char[] getDayOfMonth() {
		// TODO Auto-generated method stub
		return null;
	}

}
