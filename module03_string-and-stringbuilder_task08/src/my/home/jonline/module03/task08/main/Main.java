package my.home.jonline.module03.task08.main;

import my.home.jonline.module03.task08.logic.Logic;
import my.home.jonline.module03.task08.view.View;

/*
 * 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых 
длинных слов может быть несколько, не обрабатывать.
 */
public class Main {

	public static void main(String[] args) {
		String dataString = "This is string of some words";

		Logic logic = new Logic();
		View view = new View();

		String result;
		result = logic.findLongestWord(dataString);

		view.viewString(result);
	}

}
