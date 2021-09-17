package cursojava.classes;

import java.util.Objects;

public class Course {
	
	private double nota1;
	private String course1;
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public String getCourse1() {
		return course1;
	}
	public void setCourse1(String course1) {
		this.course1 = course1;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(course1, nota1);
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
		return Objects.equals(course1, other.course1)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1);
	}
	
	@Override
	public String toString() {
		return "Course [nota1=" + nota1 + ", course1=" + course1 + "]";
	}
	
	
}
