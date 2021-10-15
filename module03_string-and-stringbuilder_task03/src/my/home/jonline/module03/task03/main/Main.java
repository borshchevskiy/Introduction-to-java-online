package my.home.jonline.module03.task03.main;

import my.home.jonline.module03.task03.logic.Logic;
import my.home.jonline.module03.task03.view.View;
/*
 * 3. Проверить, является ли заданное слово палиндромом.
 */
public class Main {

	public static void main(String[] args) {
		String palindromeString = "abcdedcba";
		String notPalindromeString = "abcdefcba";

		Logic logic = new Logic();
		View view = new View();

		boolean result;
		//check with method using String
		result = logic.isPalindrome(palindromeString);
		view.viewResult(result);

		result = logic.isPalindrome(notPalindromeString);
		view.viewResult(result);
				
		//check with method which uses Stringbuilder
		result = logic.isPalindromeStringBuilder(palindromeString);
		view.viewResult(result);

		result = logic.isPalindromeStringBuilder(notPalindromeString);
		view.viewResult(result);
	}

}
