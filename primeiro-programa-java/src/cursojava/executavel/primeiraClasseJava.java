package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Student;

public class primeiraClasseJava {
    
	/* main é um método auto executável em java */
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String age = JOptionPane.showInputDialog("Qual a idade?");
		String birthday = JOptionPane.showInputDialog("Data de nascimento");
		String rg = JOptionPane.showInputDialog("RG");
		String cpf = JOptionPane.showInputDialog("CPF");
		String motherName = JOptionPane.showInputDialog("Nome da mãe");
		String fatherName = JOptionPane.showInputDialog("Nome do pai");
		String registrationDate = JOptionPane.showInputDialog("Data da matricula");
		String educationLevel = JOptionPane.showInputDialog("Série matriculado");
		String schoolName = JOptionPane.showInputDialog("Nome da escola");
		String course1 = JOptionPane.showInputDialog("Nome da disciplina 1");
		String nota1 = JOptionPane.showInputDialog("Nota1");
		String course2 = JOptionPane.showInputDialog("Nome da disciplina 2");
		String nota2 = JOptionPane.showInputDialog("Nota2");
		String course3 = JOptionPane.showInputDialog("Nome da disciplina 3");
		String nota3 = JOptionPane.showInputDialog("Nota3");
		String course4 = JOptionPane.showInputDialog("Nome da disciplina 4");
		String nota4 = JOptionPane.showInputDialog("Nota4");
		
		Student aluno1 = new Student();
		aluno1.setName(name);
		aluno1.setAge(Integer.valueOf(age));
		aluno1.setBirthday(birthday);
		aluno1.setId(rg);
		aluno1.setCpfNumber(cpf);
		aluno1.setMotherName(motherName);
		aluno1.setFatherName(fatherName);
		aluno1.setRegistrationDate(registrationDate);
		aluno1.setEducationLevel(educationLevel);
		aluno1.setSchoolName(schoolName);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		aluno1.setCourse1(course1);
		aluno1.setCourse2(course2);
		aluno1.setCourse3(course3);
		aluno1.setCourse4(course4);
		
		System.out.println("Nome: " + aluno1.getName());
		System.out.println("Idade: " + aluno1.getAge());
		System.out.println("Data de nascimento: " + aluno1.getBirthday());
		System.out.println("RG: " + aluno1.getId());
		System.out.println("Média do " + aluno1.getName() + ": " + aluno1.getStudentScore());
		System.out.println("Aluno1: " + (aluno1.getStudentApproved() ? "Aprovado" : "Reprovado"));
		
		System.out.println(aluno1.toString());
	}
}
