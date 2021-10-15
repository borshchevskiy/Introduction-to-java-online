package my.home.jonline.module03.task01.main;

import my.home.jonline.module03.task01.logic.Logic;
import my.home.jonline.module03.task01.view.View;
/*
 * 4. В строке найти количество чисел.
 */
public class Main {

	public static void main(String[] args) {
		String stringWithNumbers = "123gedmrg;pu456nmnd.fng789";

		Logic logic = new Logic();
		View view = new View();

		int	result;

		result = logic.countNumberOfNumbersRegex(stringWithNumbers);
		view.viewResult(result);
		
		stringWithNumbers = "123gedmrg;pu456nmnd.fng789dkgmiker01011";
		
		result = logic.countNumberOfNumbers(stringWithNumbers);
		view.viewResult(result);
				
	}

}
