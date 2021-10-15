package my.home.jonline.module04.task01.main;
/* Простейшие классы и объекты.
1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих 
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит 
наибольшее значение из этих двух переменных.
 */


import my.home.jonline.module04.task01.entity.Test1;
import my.home.jonline.module04.task01.view.Test1View;

public class Main {

	public static void main(String[] args) {
		
		Test1View view = new Test1View();
		Test1 test = new Test1();
		
		test.setFirstInt(1);
		test.setSecondInt(2);
		
		view.show(test);
		view.showMax(test);
		view.showSum(test);

	}

}
