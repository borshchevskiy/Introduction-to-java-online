package my.home.jonline.module04.task03.main;

import my.home.jonline.module04.task03.entity.State;
import my.home.jonline.module04.task03.logic.Logic;
import my.home.jonline.module04.task03.view.View;

/* Агрегация и композиция
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль 
столицу, количество областей, площадь, областные центры.
 */

public class Main {

	public static void main(String[] args) {
		State state = new State("Good state");
		Logic logic = new Logic();
		View view = new View();

		
		view.viewUnitName("State capital:", logic.getCapital(state));
		view.viewNumber("Number of regions:", logic.getNumberOfRegions(state));
		view.viewNumber("State area:", state.getArea());
		view.viewUnitNames("Region centres:", logic.getDistrictCentres(state));
		

	}

}
