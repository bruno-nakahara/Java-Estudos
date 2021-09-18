package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Course;
import cursojava.classes.Student;

public class primeiraClasseJava {
    
	/* main é um método auto executável em java */
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		for (int studentQuantity = 1; studentQuantity <= 2; studentQuantity++) {

			String name = JOptionPane.showInputDialog("Qual o nome do aluno " + studentQuantity + "?");/*
			String age = JOptionPane.showInputDialog("Qual a idade?");
			String birthday = JOptionPane.showInputDialog("Data de nascimento");
			String rg = JOptionPane.showInputDialog("RG");
			String cpf = JOptionPane.showInputDialog("CPF");
			String motherName = JOptionPane.showInputDialog("Nome da mãe");
			String fatherName = JOptionPane.showInputDialog("Nome do pai");
			String registrationDate = JOptionPane.showInputDialog("Data da matricula");
			String educationLevel = JOptionPane.showInputDialog("Série matriculado");
			String schoolName = JOptionPane.showInputDialog("Nome da escola");*/
	
			
			Student aluno = new Student();
			aluno.setName(name);/*
			aluno.setAge(Integer.valueOf(age));
			aluno.setBirthday(birthday);
			aluno.setId(rg);
			aluno.setCpfNumber(cpf);
			aluno.setMotherName(motherName);
			aluno.setFatherName(fatherName);
			aluno.setRegistrationDate(registrationDate);
			aluno.setEducationLevel(educationLevel);
			aluno.setSchoolName(schoolName);*/
			
			for (int pos = 1; pos <= 4; pos++) {
				String courseName = JOptionPane.showInputDialog("Nome da matéria" + pos);
				String courseScore = JOptionPane.showInputDialog("Nota da matéria" + pos);
				
				Course course = new Course();
				course.setCourse1(courseName);
				course.setNota1(Double.valueOf(courseScore));
				
				aluno.getCourses().add(course);
			}
			
			int checkDeleteCourse = JOptionPane.showConfirmDialog(null, "Deseja remover alguma matéria?");
			
			if (checkDeleteCourse == 0) {
				
				int removeAgain = 0;
				int position = 1;
				
				while (removeAgain == 0) {
					String removerCourse = JOptionPane.showInputDialog("Qual matéria gostaria de remover 1, 2, 3 e 4?");
					aluno.getCourses().remove(Integer.valueOf(removerCourse).intValue() - position);
					position++;
					
					removeAgain = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
				
			}
			
			students.add(aluno);
		
		}
		
		for (Student student : students) {
			
			if (student.getName().equalsIgnoreCase("Alex")) {
				System.out.println("Existe Alex!");
			}
			
			System.out.println(student);
			System.out.println("Nome: " + student.getName());
			System.out.println("Idade: " + student.getAge());
			System.out.println("Data de nascimento: " + student.getBirthday());
			System.out.println("RG: " + student.getId());
			System.out.println("Média do " + student.getName() + ": " + student.getStudentScore());
			System.out.println("Aluno1: " + (student.getStudentApproved()));
			
			System.out.println(student.toString());
			System.out.println("----------------------------------------------------------------------");
		}
		
		
	}
}
