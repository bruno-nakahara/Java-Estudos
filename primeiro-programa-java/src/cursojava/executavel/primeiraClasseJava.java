package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Student;

public class primeiraClasseJava {
    
	/* main é um método auto executável em java */
	public static void main(String[] args) {
		
		Student aluno1 = new Student();
		aluno1.setNota1(7.5);
		aluno1.setNota2(6);
		aluno1.setNota3(8);
		aluno1.setNota4(9);
		
		Student aluno2 = new Student();
		aluno2.setNota1(2);
		aluno2.setNota2(4);
		aluno2.setNota3(3);
		aluno2.setNota4(3.5);
		
		Student aluno3 = new Student();
		
		System.out.println("Média do aluno1: " + aluno1.getStudentScore());
		System.out.println("Média do aluno2: " + aluno2.getStudentScore());
		
	}
}
