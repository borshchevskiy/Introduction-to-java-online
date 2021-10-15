package my.home.jonline.module03.task07.main;

import my.home.jonline.module03.task07.logic.Logic;
import my.home.jonline.module03.task07.view.View;

/*
 * 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
def", то должно быть выведено "abcdef".
 */
public class Main {

	public static void main(String[] args) {
		String dataString = "abc cde def";

		Logic logic = new Logic();
		View view = new View();

		String result;
		result = logic.removeSpacesAndDoubles(dataString);

		view.viewString(result);
	}

}
