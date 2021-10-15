package my.home.jonline.module04.task02.main;
/* Простейшие классы и объекты.
2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра 
класса.
 */

import my.home.jonline.module04.task02.entity.Test2;

public class Main {

	public static void main(String[] args) {
		
		Test2 test = new Test2();
		Test2 test2 = new Test2(3,4);
		
		System.out.println(test);
		System.out.println(test2);


	}

}
