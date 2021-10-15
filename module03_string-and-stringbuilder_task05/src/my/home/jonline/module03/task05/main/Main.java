package my.home.jonline.module03.task05.main;

import my.home.jonline.module03.task05.logic.Logic;
import my.home.jonline.module03.task05.view.View;

/*
 * 6. Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class Main {

	public static void main(String[] args) {
		String dataString = "akognmaongnmamngoa[agapmagaaga  gaer3465tasga agaga "; // 16 a

		Logic logic = new Logic();
		View view = new View();

		int result;
		result = logic.countA(dataString);

		view.viewResult(result);
	}

}
