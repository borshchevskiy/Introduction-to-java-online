package my.home.jonline.module04.task02.main;

import my.home.jonline.module04.task02.entity.Car;
import my.home.jonline.module04.task02.view.View;

/* Агрегация и композиция
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
менять колесо, вывести на консоль марку автомобиля.
 */


public class Main {

	public static void main(String[] args) {
		View view = new View();
		Car car = new Car("White", "Toyota", 1.6, 4, 4, 15);

		car.ride();
		car.fuelUp(15);
		car.changeWheel();
		
		view.showMessage("Марка машины: " + car.getBrand());
	}

}
