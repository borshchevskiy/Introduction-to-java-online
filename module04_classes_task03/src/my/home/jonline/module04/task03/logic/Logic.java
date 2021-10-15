package my.home.jonline.module04.task03.logic;


import my.home.jonline.module04.task03.entity.Faculty;
import my.home.jonline.module04.task03.entity.Student;
import my.home.jonline.module04.task03.view.View;

public class Logic {

	View view = new View();
	
	public void findHighGraders(Faculty faculty) {
		
		boolean isHighGrader;
		Student[] students;
				
		students = faculty.getStudents();
		
		
		for (Student student : students) {
			isHighGrader = true;
			for (double grade : student.getGrades()) {
				if (grade < 9) {
					isHighGrader = false;
				}
			}
			if (isHighGrader) {
				view.showStudent(student);
			}
		}
	}
	
}
