package my.home.jonline.module03.task06.main;

import my.home.jonline.module03.task06.logic.Logic;
import my.home.jonline.module03.task06.view.View;

/*
 * 6. Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class Main {

	public static void main(String[] args) {
		String dataString = "abcdef ghi";

		Logic logic = new Logic();
		View view = new View();

		String result;
		result = logic.doubleCharactersInString(dataString);

		view.viewString(result);
	}

}
