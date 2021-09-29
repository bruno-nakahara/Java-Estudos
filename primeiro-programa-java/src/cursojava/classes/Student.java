package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cursojava.constantes.StatusStudent;

public class Student extends People {
	
	private String registrationDate;
	private String schoolName;
	private String educationLevel;
	
	private List<Course> courses = new ArrayList<Course>();
	
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	public List<Course> getCourses() {
		return courses;
	}
	
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

	public double getStudentScore() {
		
		double sumScore = 0;
		
		for (Course course : courses) {
			sumScore += course.getNota1();
		}
		
		return sumScore / courses.size();
	}
	
	public String getStudentApproved() {
		double score = this.getStudentScore(); 
		
		if (score >= 5) {
			
			if (score >= 7) {
				return StatusStudent.APPROVED;
			} else {
				return StatusStudent.RETAKE;
			}
			
		} else {
			return StatusStudent.FAILED;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", birthday=" + birthday + ", id=" + id + ", cpfNumber="
				+ cpfNumber + ", motherName=" + motherName + ", fatherName=" + fatherName + ", registrationDate="
				+ registrationDate + ", schoolName=" + schoolName + ", educationLevel=" + educationLevel + "]";
	}
	
	@Override
	public boolean adultAge() {
		
		return age >= 21;
	}
		
	public String msgAdultAge() {
		return this.adultAge() ? "Maior de idaide" : "Menor";
	}

	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return 1500.90;
	}
}
