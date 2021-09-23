package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Course;
import cursojava.classes.Student;
import cursojava.constantes.StatusStudent;

public class primeiraClasseJava {
    
	/* main � um m�todo auto execut�vel em java */
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String password = JOptionPane.showInputDialog("Informe a senha");
		
		if (login.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
					
			List<Student> students = new ArrayList<Student>();
			
			HashMap<String, List<Student>> maps = new HashMap<String, List<Student>>();
			
			for (int studentQuantity = 1; studentQuantity <= 5; studentQuantity++) {
	
				String name = JOptionPane.showInputDialog("Qual o nome do aluno " + studentQuantity + "?");/*
				String age = JOptionPane.showInputDialog("Qual a idade?");
				String birthday = JOptionPane.showInputDialog("Data de nascimento");
				String rg = JOptionPane.showInputDialog("RG");
				String cpf = JOptionPane.showInputDialog("CPF");
				String motherName = JOptionPane.showInputDialog("Nome da m�e");
				String fatherName = JOptionPane.showInputDialog("Nome do pai");
				String registrationDate = JOptionPane.showInputDialog("Data da matricula");
				String educationLevel = JOptionPane.showInputDialog("S�rie matriculado");
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
				
				for (int pos = 1; pos <= 1; pos++) {
					String courseName = JOptionPane.showInputDialog("Nome da mat�ria" + pos);
					String courseScore = JOptionPane.showInputDialog("Nota da mat�ria" + pos);
					
					Course course = new Course();
					course.setCourse1(courseName);
					course.setNota1(Double.valueOf(courseScore));
					
					aluno.getCourses().add(course);
				}
				
				int checkDeleteCourse = JOptionPane.showConfirmDialog(null, "Deseja remover alguma mat�ria?");
				
				if (checkDeleteCourse == 0) {
					
					int removeAgain = 0;
					int position = 1;
					
					while (removeAgain == 0) {
						String removerCourse = JOptionPane.showInputDialog("Qual mat�ria gostaria de remover 1, 2, 3 e 4?");
						aluno.getCourses().remove(Integer.valueOf(removerCourse).intValue() - position);
						position++;
						
						removeAgain = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
					}
					
				}
				
				students.add(aluno);
			
			}
			
			maps.put(StatusStudent.APPROVED, new ArrayList<Student>());
			maps.put(StatusStudent.RETAKE, new ArrayList<Student>());
			maps.put(StatusStudent.FAILED, new ArrayList<Student>());
			
			for (Student student : students) {
				
				if (student.getStudentApproved().equalsIgnoreCase(StatusStudent.APPROVED)) {
					maps.get(StatusStudent.APPROVED).add(student);
				} else if (student.getStudentApproved().equalsIgnoreCase(StatusStudent.RETAKE)) {
					maps.get(StatusStudent.RETAKE).add(student);
				} else {
					maps.get(StatusStudent.FAILED).add(student);
				}
			}
			
			
			System.out.println("==================Lista dos aprovados====================");
			for (Student student : maps.get(StatusStudent.APPROVED)) {
				System.out.println("Nome: " + student.getName() + " M�dia: " + student.getStudentScore());
			}
			
			System.out.println("==================Lista de alunos em recupera��o=========");
			for (Student student : maps.get(StatusStudent.RETAKE)) {
				System.out.println("Nome: " + student.getName() + " M�dia: " + student.getStudentScore());
			}
			
			System.out.println("==================Lista dos reprovados===================");
			for (Student student : maps.get(StatusStudent.FAILED)) {
				System.out.println("Nome: " + student.getName() + " M�dia: " + student.getStudentScore());
			}
		}
	}
}
