package cursojava.executavel;

public class primeiraClasseJava {
    
	/* main � um m�todo auto execut�vel em java */
	public static void main(String[] args) {
		double nota1 = 2;
		double nota2 = 6;
		double mediaAluno = (nota1 + nota2) / 2;
		
		if (mediaAluno >= 7) {
			System.out.println("Aprovado - Nota final: " + mediaAluno);
		} else if (mediaAluno >= 5 && mediaAluno < 7) {
			System.out.println("Recupera��o");
		} else {
			System.out.println("Reprovado");
		}
		
		/* Operadores tern�rios - s�o para micro valida��es*/
		
		String resultadoAluno;
		
		resultadoAluno = mediaAluno >= 7 ? "Aprovado" : (mediaAluno >= 5 && mediaAluno < 7) ? "Recupera��o" : "Reprovado";
		
		System.out.println(resultadoAluno);
		
		
	}
}
