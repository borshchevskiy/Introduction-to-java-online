package my.home.jonline.module04.task01.main;

import my.home.jonline.module04.task01.entity.Sentence;
import my.home.jonline.module04.task01.entity.Text;
import my.home.jonline.module04.task01.entity.Word;

/* Агрегация и композиция
 * 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на 
консоль текст, заголовок текста.
 */

public class Main {

	public static void main(String[] args) {
		Text text;

		Word firstWord = new Word("У");
		Word secondWord = new Word("самурая");
		Word thirdWord = new Word("нет");
		Word forthWord = new Word("цели");
		Word fifthWord = new Word(".");

		text = new Text(new Sentence(""),
				new Sentence(firstWord, secondWord, thirdWord, forthWord, fifthWord));
		
		text.setHeader("Заголовок");

		text.addSentence(new Sentence("Только путь."));
		
		text.viewText();
	}

}
