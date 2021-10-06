package cursojava.classes;

import java.util.Arrays;
import java.util.Objects;

public class Course {
	
	private double[] nota = new double[4];
	private String course;
	
	
	public double[] getNota() {
		return nota;
	}
	public void setNota(double[] nota) {
		this.nota = nota;
	}
	public String getCourse1() {
		return course;
	}
	public void setCourse1(String course1) {
		this.course = course1;
	}
	
	public double getNotaMedia() {
		double somaTotal = 0;
		
		for (int pos = 0; pos < nota.length; pos++) {
			somaTotal += nota[pos];
		}
		
		return somaTotal / nota.length;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(course);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(course, other.course) && Arrays.equals(nota, other.nota);
	}
	@Override
	public String toString() {
		return "Course [nota1=" + nota + ", course1=" + course + "]";
	}
	
	
}
