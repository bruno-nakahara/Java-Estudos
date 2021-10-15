package cursojava.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateInJava {

		public static void main(String[] args) throws ParseException {
			
			Date date = new Date();
			Calendar calendar = Calendar.getInstance();
			
			calendar.add(Calendar.DAY_OF_MONTH, 5);
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
			
			Date birthday = simpleDateFormat.parse("14/10/2021");
			System.out.println(calendar.getTime());
			
			long days = ChronoUnit.DAYS.between(LocalDate.parse("2021-10-01"), LocalDate.now());
			System.out.println("Possui " + days + " dias entre a faixa de data 01/02/2021 e agora");
			
			if (birthday.before(date)) {
				System.out.println("Hoje: " + date);
			} else {
				System.out.println("depois");
			}
			
			
		}
}
