package cursojava.classes;

public class Director extends People {
	private String educationRegister;
	private int timeDirection;
	private String degree;
	
	public String getEducationRegister() {
		return educationRegister;
	}
	public void setEducationRegister(String educationRegister) {
		this.educationRegister = educationRegister;
	}
	public int getTimeDirection() {
		return timeDirection;
	}
	public void setTimeDirection(int timeDirection) {
		this.timeDirection = timeDirection;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	@Override
	public String toString() {
		return "Director [educationRegister=" + educationRegister + ", timeDirection=" + timeDirection + ", degree="
				+ degree + ", name=" + name + ", age=" + age + ", birthday=" + birthday + ", id=" + id + ", cpfNumber="
				+ cpfNumber + ", motherName=" + motherName + ", fatherName=" + fatherName + "]";
	}
	
	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return 3900.78;
	}
	
	
	
	
}
