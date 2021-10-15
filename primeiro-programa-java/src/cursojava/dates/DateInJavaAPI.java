package cursojava.dates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateInJavaAPI {

		public static void main(String[] args) throws InterruptedException {
			
			
//			LocalDate dateNow = LocalDate.now();
			Instant start = Instant.now();
			
			Thread.sleep(4000);
			
			Instant finalTime = Instant.now();
			
			Duration duration = Duration.between(start, finalTime);
			
			System.out.println(duration.getSeconds());
			
//			System.out.println(dateNow.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//			System.out.println(dateNow.getDayOfWeek());
//			
//			LocalTime timeNow = LocalTime.now();
//			
//			System.out.println(timeNow);
//			
//			LocalDateTime dateTimeNow = LocalDateTime.now();
//			
//			System.out.println(dateTimeNow.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		}

}
