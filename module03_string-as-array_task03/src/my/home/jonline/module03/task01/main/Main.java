package my.home.jonline.module03.task01.main;

import my.home.jonline.module03.task01.logic.Logic;
import my.home.jonline.module03.task01.view.View;
/*
 * 3. В строке найти количество цифр.
 */
public class Main {

	public static void main(String[] args) {
		String stringWithDigits = "123gedmrg;pl456nmnd.fng789";

		Logic logic = new Logic();
		View view = new View();

		int	result;

		result = logic.countNumberOfDigits(stringWithDigits);
		view.viewResult(result);
	}

}
