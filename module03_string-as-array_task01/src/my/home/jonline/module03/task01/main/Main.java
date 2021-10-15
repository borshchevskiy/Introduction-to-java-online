package my.home.jonline.module03.task01.main;

import my.home.jonline.module03.task01.logic.Logic;
import my.home.jonline.module03.task01.view.View;
/*
 * 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */
public class Main {

	public static void main(String[] args) {
		String[] camelCaseStrings;
		camelCaseStrings = new String[] { "camelCase", "oneTwo", "helloGoodbye", "dayNight" };

		Logic logic = new Logic();
		View view = new View();

		String[] snakeCaseStrings;

		snakeCaseStrings = logic.camelToSnake(camelCaseStrings);
		view.viewStringArray(snakeCaseStrings);
	}

}
