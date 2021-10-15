package my.home.jonline.module04.task03.main;


import my.home.jonline.module04.task03.entity.Student;
import my.home.jonline.module04.task03.logic.Logic;
import my.home.jonline.module04.task03.entity.Faculty;

/* Простейшие классы и объекты.
3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив 
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и 
номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Main {

	public static void main(String[] args) {

		final int numberOfStudents = 10;

		Faculty faculty = new Faculty(numberOfStudents);
		Logic logic = new Logic();

		faculty.addStudent(new Student("Ivanov I.I.", 1, new double[] { 7, 7, 7, 7, 7 }));
		faculty.addStudent(new Student("Petrov P.P.", 2, new double[] { 6, 7, 8, 9, 10 }));
		faculty.addStudent(new Student("Sidorov S.S.", 3, new double[] { 8, 8, 8, 8, 8 }));
		faculty.addStudent(new Student("Smirnov S.S.", 2, new double[] { 10, 9, 8, 7, 6 }));
		faculty.addStudent(new Student("Sokolov S.S.", 1, new double[] { 9, 9, 9, 9, 9 }));
		faculty.addStudent(new Student("Popov P.P.", 3, new double[] { 8, 7, 8, 7, 8 }));
		faculty.addStudent(new Student("Vasiliev V.V.", 1, new double[] { 10, 10, 10, 10, 10 }));
		faculty.addStudent(new Student("Mikhailov M.M.", 2, new double[] { 9, 8, 9, 8, 9 }));
		faculty.addStudent(new Student("Volkov V.V.", 3, new double[] { 9, 10, 9, 10, 9 }));
		faculty.addStudent(new Student("Borschevskiy I.V.", 1, new double[] { 6, 6, 6, 6, 6 }));

		logic.findHighGraders(faculty);

	}

}
