package dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DemoTestDateandTime {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd,MMM,yyyy");
		String formatDateTime = now.format(dateFormat); 
        System.out.println("Before Formatting: " + formatDateTime); 
        DateTimeFormatter convertingDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String resultingDateFormat = now.format(convertingDateFormat); 
        System.out.println("After Formatting: " + resultingDateFormat);  
		
	}

}
