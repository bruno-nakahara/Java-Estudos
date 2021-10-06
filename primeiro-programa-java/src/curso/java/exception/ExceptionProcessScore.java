package curso.java.exception;

public class ExceptionProcessScore extends Exception {

		public ExceptionProcessScore(String error) {
			super("Vish deu merda " + error);
		}
}
