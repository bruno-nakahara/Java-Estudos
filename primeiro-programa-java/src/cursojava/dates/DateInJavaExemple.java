package cursojava.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateInJavaExemple {
	
	public static void main(String[] args) throws ParseException {
		
		Date startDay = new SimpleDateFormat("dd/MM/yyyy").parse("14/10/2021");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDay);
		
		for (int parcela = 1; parcela <= 12; parcela++) {
			calendar.add(Calendar.MONTH, 1);
			
			System.out.println("Parcela de número: " + parcela + " vencimento em " 
			+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}
	}
}
