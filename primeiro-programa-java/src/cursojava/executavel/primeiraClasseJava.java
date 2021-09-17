package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Course;
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
		
		for (int pos = 1; pos <= 4; pos++) {
			String courseName = JOptionPane.showInputDialog("Nome da matéria" + pos);
			String courseScore = JOptionPane.showInputDialog("Nota da matéria" + pos);
			
			Course course = new Course();
			course.setCourse1(courseName);
			course.setNota1(Double.valueOf(courseScore));
			
			aluno1.getCourses().add(course);
		}
		
		int checkDeleteCourse = JOptionPane.showConfirmDialog(null, "Deseja remover alguma matéria?");
		
		if (checkDeleteCourse == 0) {
			String removerCourse = JOptionPane.showInputDialog("Qual matéria gostaria de remover 1, 2, 3 e 4?");
			aluno1.getCourses().remove(Integer.valueOf(removerCourse).intValue() - 1);
		}
		
		System.out.println("Nome: " + aluno1.getName());
		System.out.println("Idade: " + aluno1.getAge());
		System.out.println("Data de nascimento: " + aluno1.getBirthday());
		System.out.println("RG: " + aluno1.getId());
		System.out.println("Média do " + aluno1.getName() + ": " + aluno1.getStudentScore());
		System.out.println("Aluno1: " + (aluno1.getStudentApproved() ? "Aprovado" : "Reprovado"));
		
		System.out.println(aluno1.toString());
	}
}
