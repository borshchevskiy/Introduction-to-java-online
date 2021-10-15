package my.home.jonline.module03.task01.main;

import my.home.jonline.module03.task01.logic.Logic;
import my.home.jonline.module03.task01.view.View;
/*
 * 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. 
Крайние пробелы в строке удалить.
 */
public class Main {

	public static void main(String[] args) {
		String stringWithSpaces = "         wkentjkewrt  wermtlknjer tmemw  lemt;emrter   t t t t t;'e,'t      ";

		Logic logic = new Logic();
		View view = new View();

		String result;
		result = logic.removeSpacesWithCharArray(stringWithSpaces);
		view.viewString(result);
		
		result = logic.removeSpaces(stringWithSpaces);
		view.viewString(result);
		
		

				
	}

}
