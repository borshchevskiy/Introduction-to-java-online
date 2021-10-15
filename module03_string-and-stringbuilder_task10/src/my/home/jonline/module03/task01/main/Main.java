package my.home.jonline.module03.task01.main;

import my.home.jonline.module03.task01.logic.Logic;
import my.home.jonline.module03.task01.view.View;

/*
 * 10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным 
знаком. Определить количество предложений в строке X.
 */
public class Main {

	public static void main(String[] args) {
		String dataString = "This. Is? String! Of. Some! Words?";

		Logic logic = new Logic();
		View view = new View();

		int result;
		
		result = logic.countSentences(dataString);

		view.viewResult(result);

	}

}
