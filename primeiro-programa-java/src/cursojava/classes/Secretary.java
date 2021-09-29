package cursojava.classes;

import cursojava.interfaces.AccessPermission;

public class Secretary extends People implements AccessPermission {
	
	private String register;
	private String jobLevel;
	private String experience;	
	
	private String login;
	private String password;
	
	public Secretary(String login, String password) {	
		this.login = login;
		this.password = password;
	}
	
	public Secretary() {	
	}
	
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getJobLevel() {
		return jobLevel;
	}
	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	@Override
	public String toString() {
		return "Secretary [register=" + register + ", jobLevel=" + jobLevel + ", experience=" + experience + ", name="
				+ name + ", age=" + age + ", birthday=" + birthday + ", id=" + id + ", cpfNumber=" + cpfNumber
				+ ", motherName=" + motherName + ", fatherName=" + fatherName + "]";
	}
	
	@Override
	public double salary() {
		return 1800.80 * 0.9;
	}
	
	@Override
	public boolean authentic(String login, String password) {
		this.login = login;
		this.password = password;
		
		return authentic();
	}	
	
	@Override
	public boolean authentic() {
		return login.equals("admin") && password.equals("admin");
	}
}
