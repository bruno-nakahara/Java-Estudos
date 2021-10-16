package cursojava.dates;

import java.time.LocalDate;
import java.time.Period;

public class DatePeriod {

		public static void main(String[] args) {
			
			LocalDate dateOld = LocalDate.of(2020, 2, 7);
			
			LocalDate dateNew = LocalDate.of(2023, 8, 18);
			
			LocalDate dateBase = LocalDate.parse("2021-10-14");//Serve como base para todo resto
			
			System.out.println(dateOld.isAfter(dateNew));
			
			System.out.println(dateOld.isEqual(dateNew));
			
			System.out.println(dateBase.plusDays(10));
			
			System.out.println(dateBase.plusMonths(1));
			
			System.out.println(dateBase.minusMonths(1));
			
			System.out.println(dateBase = dateBase.plusDays(10));
			
			System.out.println(dateBase.plusYears(1));//Como a variável dateBase mudou antes, o valor novo vai ser somado na dateBase nova
			
			Period period = Period.between(dateOld, dateNew);
			
			System.out.println("Periodo é : " + period.getYears() + " anos " + period.getMonths() + " meses " + period.getDays() + " dias");
		}
}
