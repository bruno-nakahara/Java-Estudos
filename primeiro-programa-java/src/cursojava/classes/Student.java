package cursojava.classes;

public class Student {
	private String name;
	private int age;
	private String birthday;
	private String id;
	private String cpfNumber;
	private String motherName;
	private String fatherName;
	private String registrationDate;
	private String schoolName;
	private String educationLevel;
	
	private double nota1;
	private String course1;
	private double nota2;
	private String course2;
	private double nota3;
	private String course3;
	private double nota4;
	private String course4;
	
	public Student() {
		
	}
	
	public Student (String nameDefault) {
		name = nameDefault;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
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

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	public String getCourse1() {
		return course1;
	}

	public void setCourse1(String course1) {
		this.course1 = course1;
	}

	public String getCourse2() {
		return course2;
	}

	public void setCourse2(String course2) {
		this.course2 = course2;
	}

	public String getCourse3() {
		return course3;
	}

	public void setCourse3(String course3) {
		this.course3 = course3;
	}

	public String getCourse4() {
		return course4;
	}

	public void setCourse4(String course4) {
		this.course4 = course4;
	}

	public double getStudentScore() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}
	
	public boolean getStudentApproved() {
		double score = this.getStudentScore(); 
		
		if (score >= 7) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", birthday=" + birthday + ", id=" + id + ", cpfNumber="
				+ cpfNumber + ", motherName=" + motherName + ", fatherName=" + fatherName + ", registrationDate="
				+ registrationDate + ", schoolName=" + schoolName + ", educationLevel=" + educationLevel + ", nota1="
				+ nota1 + ", course1=" + course1 + ", nota2=" + nota2 + ", course2=" + course2 + ", nota3=" + nota3
				+ ", course3=" + course3 + ", nota4=" + nota4 + ", course4=" + course4 + "]";
	}

	
	
	
}
