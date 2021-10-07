package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class Matriz {

		public static void main(String[] args) {
			
			String text = "Bruno, JDEV, 8.8, 7.0, 9.2, 8.1";
			
			String[] textArray = text.split(",");
			
			for (int pos = 0; pos < textArray.length; pos++) {
				System.out.println(textArray[pos]);
			}
			
			List<String> list = Arrays.asList(textArray);
			System.out.println(list);
			
			for (String textString : list) {
				System.out.println(textString);
			}
			
			String[] convertArray = list.toArray(new String[6]);
			
			System.out.println(convertArray);
			for (int pos = 0; pos < convertArray.length; pos++) {
				System.out.println(convertArray[pos]);
			}
		}
}
