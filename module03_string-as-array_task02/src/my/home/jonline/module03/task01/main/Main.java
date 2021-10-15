package my.home.jonline.module03.task01.main;

import my.home.jonline.module03.task01.logic.Logic;
import my.home.jonline.module03.task01.view.View;
/*
 * 2. Замените в строке все вхождения 'word' на 'letter'.
 */
public class Main {

	public static void main(String[] args) {
		String stringWithWords = "word thisisword wordword thisisalsoword and this is word";

		Logic logic = new Logic();
		View view = new View();

		String stringWithLetters;

		stringWithLetters = logic.replaceWordWithLetter(stringWithWords, "word", "letter");
		view.viewString(stringWithLetters);
	}

}
