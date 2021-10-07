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
		
		Student[] arrayStudents = new Student[1];
		
		arrayStudents[0] = student;
		
		for (int pos = 0; pos < arrayStudents.length; pos++) {
			System.out.println(arrayStudents[pos].getName());
			
			for (Course courseList : arrayStudents[pos].getCourses()) {
				System.out.println(courseList.getCourse1());
				
				for (int posScore = 0; posScore < courseList.getNota().length; posScore++) {
					System.out.println(courseList.getNota()[posScore]);
				}
			}
		}
	}
}
