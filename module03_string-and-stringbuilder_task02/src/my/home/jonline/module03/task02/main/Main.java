package my.home.jonline.module03.task02.main;

import my.home.jonline.module03.task02.logic.Logic;
import my.home.jonline.module03.task02.view.View;
/*
 * 2. В строке вставить после каждого символа 'a' символ 'b'.
 */
public class Main {

	public static void main(String[] args) {
		String stringOfA = "aaaaacccaaa";

		Logic logic = new Logic();
		View view = new View();

		String result;
		result = logic.insertAAfterB(stringOfA);
		view.viewString(result);

				
	}

}
