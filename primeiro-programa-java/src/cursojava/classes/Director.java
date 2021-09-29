package cursojava.classes;

import cursojava.interfaces.AccessPermission;

public class Director extends People implements AccessPermission {
	private String educationRegister;
	private int timeDirection;
	private String degree;
	
	private String login;
	private String password;
	
	public Director(String login, String password) {	
		this.login = login;
		this.password = password;
	}
	
	public Director() {	
	}
	
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
	
	@Override
	public boolean authentic(String login, String password) {
		this.login = login;
		this.password = password;
		
		return authentic();
	}	
	
	@Override
	public boolean authentic() {
		return login.equals("bruno") && password.equals("123");
	}
	
}
