package my.home.jonline.module03.task04.main;

import my.home.jonline.module03.task04.logic.Logic;
import my.home.jonline.module03.task04.view.View;

/*
 * 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */
public class Main {

	public static void main(String[] args) {
		String dataString = "информатика";
		String requiredString = "торт";

		Logic logic = new Logic();
		View view = new View();

		String result;
		result = logic.convertString(dataString, requiredString);

		view.viewString(result);
	}

}
