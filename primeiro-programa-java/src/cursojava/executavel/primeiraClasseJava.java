package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Student;

public class primeiraClasseJava {
    
	/* main � um m�todo auto execut�vel em java */
	public static void main(String[] args) {
		
		Student aluno1 = new Student();
		
		Student aluno2 = new Student();
		
		Student aluno3 = new Student("Bruno");
		
		System.out.println(aluno3);
		
	}
}
