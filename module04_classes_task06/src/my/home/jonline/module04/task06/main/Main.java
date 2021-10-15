package my.home.jonline.module04.task06.main;

import my.home.jonline.module04.task06.entity.Time;

/* Простейшие классы и объекты.
 * 6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и 
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае 
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на 
заданное количество часов, минут и секунд.
 */

public class Main {

	public static void main(String[] args) {
		
		Time time = new Time();

		System.out.println(time.getTime());//check constructor without parameters

		
		
		time = new Time(72, 84, -15);

		System.out.println(time.getTime());//check constructor with non-valid parameters

		
		
		time = new Time(23, 59, 59);

		System.out.println(time.getTime());//check constructor with 3 parameters
		
		
		
		time.setTime(-1, 25, 60);
		
		System.out.println(time.getTime());//check set time method
		
		
				
		time.increaseTime(23, 30, 59);
		
		System.out.println(time.getTime());//check time increase method
		
		
		
		time.increaseTime(1, 125, 2);
		
		System.out.println(time.getTime());//check time increase method going to the new day
		

		
		time.decreaseTime(1, 125, 2);
		
		System.out.println(time.getTime());//check time decrease method going to the previous day
	}

}
