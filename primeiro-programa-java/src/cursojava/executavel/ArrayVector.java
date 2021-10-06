package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Course;
import cursojava.classes.Student;

public class ArrayVector {
	
	public static void main(String[] args) {
		
		double[] notas = {8.8, 7.7, 9, 8};
		double[] notasJs = {6, 6.7, 5.4, 5};
		
		Student student = new Student();
		student.setName("Bruno");
		student.setSchoolName("JDEV");
		
		Course course = new Course();
		course.setCourse1("Java");
		course.setNota(notas);
		
		student.getCourses().add(course);
		
		Course course2 = new Course();
		course2.setCourse1("JS");
		course2.setNota(notasJs);
		
		student.getCourses().add(course2);
		
		System.out.println("Aluno " + student.getName() + " inscrito no curso " + student.getSchoolName());
		
		for (Course courseList : student.getCourses()) {
			
			System.out.println("Curso " + courseList.getCourse1());
			System.out.println("As notas:");
			
			double maxScore = 0.0;
			double minScore = 0.0;
			for (int pos = 0; pos < courseList.getNota().length; pos++) {	
				System.out.println(courseList.getNota()[pos]);
				
				if (pos == 0) {
					maxScore = courseList.getNota()[pos];
					minScore = courseList.getNota()[pos];
				} else {
					if (courseList.getNota()[pos] > maxScore) {
						maxScore = courseList.getNota()[pos];
					}
					if (courseList.getNota()[pos] < minScore) {
						minScore = courseList.getNota()[pos];
					}
				}
			}
			System.out.println("Maior nota do curso " + courseList.getCourse1() + " é igual " + maxScore);
			System.out.println("Menor nota do curso " + courseList.getCourse1() + " é igual " + minScore);
			System.out.println("Média: " + courseList.getNotaMedia());
		}
		
	}
}
