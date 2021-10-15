package my.home.jonline.module03.task01.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logic {

	public int countNumberOfNumbers(String inputString) {
		int result;
		char[] stringChars;
		boolean isNewNumber;
		
		result = 0;
		stringChars = inputString.toCharArray();
		isNewNumber = false;

		for (char c : stringChars) {
			if (Character.isDigit(c)) {
				if (!isNewNumber) {
					isNewNumber = true;
					result++;
				}

			} else {
				isNewNumber = false;
			}
		}

		return result;

	}

	public int countNumberOfNumbersRegex(String inputString) {
		int result = 0;
		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher matcher = pattern.matcher(inputString);

		while (matcher.find()) {
			result++;
		}

		return result;
	}
}
