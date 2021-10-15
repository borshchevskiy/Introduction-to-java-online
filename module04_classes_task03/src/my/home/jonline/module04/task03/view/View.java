package my.home.jonline.module04.task03.view;

import my.home.jonline.module04.task03.entity.Student;

public class View {

	public void showStudent(String message, Student student) {
		System.out.println(message);
		System.out.println("Студент: " + student.getName() + "\n" + "Группа: " + student.getGroupNumber());
		System.out.println();
	}

	public void showStudent(Student student) {
		System.out.println("Студент: " + student.getName() + "\n" + "Группа: " + student.getGroupNumber());
		System.out.println();
	}

}
