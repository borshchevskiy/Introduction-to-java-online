package my.home.jonline.module03.task09.main;

import my.home.jonline.module03.task09.logic.Logic;
import my.home.jonline.module03.task09.view.View;

/*
 * 9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские 
буквы.
 */
public class Main {

	public static void main(String[] args) {
		String dataString = "This Is String Of Some Words";// 6 uppercase, 17 lowercase

		Logic logic = new Logic();
		View view = new View();

		int lowerCaseCharacters;
		int upperCaseCharacters;
		
		lowerCaseCharacters = logic.countLowerCaseCharacters(dataString);
		upperCaseCharacters = logic.countUpperCaseCharacters(dataString);

		view.viewResult(lowerCaseCharacters);
		view.viewResult(upperCaseCharacters);
	}

}
