package cursojava.classes;

public class Secretary extends People {
	
	private String register;
	private String jobLevel;
	private String experience;
	
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
		// TODO Auto-generated method stub
		return 1800.80 * 0.9;
	}
	
	
}
