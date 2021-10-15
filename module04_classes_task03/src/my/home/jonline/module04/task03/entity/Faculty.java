package my.home.jonline.module04.task03.entity;

public class Faculty {

	private Student[] students;

	public Faculty() {
		
	}

	public Faculty(int size) {
		
		this.students = new Student[size];
	}

	
	public Student[] getStudents() {
		return students;
	}

	
	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	public int getGroupSize() {
		return students.length;
	}
	
	
	public void addStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}
	
	public void removeStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == student) {
				students[i] = null;				
			}
		}
	}
	
	public void removeStudent(int index) {
		if (index >=0 && index < students.length) {
			students[index] = null;
		}
		
	}
	
}
