package cursojava.executavel;

import cursojava.classes.Director;
import cursojava.classes.People;
import cursojava.classes.Secretary;
import cursojava.classes.Student;

public class TestingChildClass {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setName("Bruno");
		student.setAge(21);
		
		Director director = new Director();
		director.setName("Alex");
		director.setAge(61);
		
		Secretary secretary = new Secretary();
		secretary.setJobLevel("Senior");
		
		System.out.println(student);
		System.out.println(student.adultAge());
		System.out.println(student.msgAdultAge());
		System.out.println(student.salary());
		System.out.println(director);
		System.out.println(director.adultAge());
		System.out.println(director.salary());
		System.out.println(secretary);
		System.out.println(secretary.salary());
		
		teste(student);
		teste(director);
		
	}
	
	public static void teste(People people) {
		System.out.println(people.getName());
	}
}
