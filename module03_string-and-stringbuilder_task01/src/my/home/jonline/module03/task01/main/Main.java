package my.home.jonline.module03.task01.main;

import my.home.jonline.module03.task01.logic.Logic;
import my.home.jonline.module03.task01.view.View;
/*
 * 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
public class Main {

	public static void main(String[] args) {
		String stringWithSpaces = "      gdrt,pokr   trr t t t e    ";// 6 spaces

		Logic logic = new Logic();
		View view = new View();

		int result;
		result = logic.countConsecutiveSpace(stringWithSpaces);
		view.viewNumber(result);

				
	}

}
