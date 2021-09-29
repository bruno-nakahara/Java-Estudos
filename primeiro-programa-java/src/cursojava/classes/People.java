package cursojava.classes;

public abstract class People {
	protected String name;
	protected int age;
	protected String birthday;
	protected String id;
	protected String cpfNumber;
	protected String motherName;
	protected String fatherName;
	
	public abstract double salary();// as classes filhas tem implementar o m�todo
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCpfNumber() {
		return cpfNumber;
	}
	public void setCpfNumber(String cpfNumber) {
		this.cpfNumber = cpfNumber;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	
	public boolean adultAge() {
		return age >= 18;
	}
}
