package cursojava.executavel;

public class primeiraClasseJava {
    
	/* main é um método auto executável em java */
	public static void main(String[] args) {
		double nota1 = 2;
		double nota2 = 6;
		double mediaAluno = (nota1 + nota2) / 2;
		
		if (mediaAluno >= 7) {
			System.out.println("Aprovado - Nota final: " + mediaAluno);
		} else if (mediaAluno >= 5 && mediaAluno < 7) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		/* Operadores ternários - são para micro validações*/
		
		String resultadoAluno;
		
		resultadoAluno = mediaAluno >= 7 ? "Aprovado" : (mediaAluno >= 5 && mediaAluno < 7) ? "Recuperação" : "Reprovado";
		
		System.out.println(resultadoAluno);
		
		
	}
}
