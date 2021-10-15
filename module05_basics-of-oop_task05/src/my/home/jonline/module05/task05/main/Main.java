package my.home.jonline.module05.task05.main;

import my.home.jonline.module05.task05.service.CompositionMaker;

/*
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().

Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы
и упаковка.

 */

public class Main {

	public static void main(String[] args) {
		/*
		 * App uses builder pattern to construct flower composition object
		 * and factory pattern to produce flower objects
		 */
		String request1 = "flower1=camomile+white+1&wrapping=paper+white";//flower camomile is not available
		String request2 = "flower1=rose+red+-20&wrapping=none+none";//quantity -20 is unacceptable
		String request3 = "flower1=tulip+yellow+15&flower2=lily+white+10&wrapping=basket+yellow";
		String request4 = "flower1=rose+teal+101&&wrapping=paper+white";

		CompositionMaker maker = new CompositionMaker();
		maker.getRequest(request1);
		System.out.println();
		maker.getRequest(request2);
		System.out.println();
		maker.getRequest(request3);
		System.out.println();
		maker.getRequest(request4);
	}

}
