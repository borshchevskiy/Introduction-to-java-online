package my.home.jonline.module03.task09.logic;

public class Logic {

	public int countUpperCaseCharacters(String inputString) {

		char[] inputStringArray;
		int countUpperCase;

		inputStringArray = inputString.toCharArray();
		countUpperCase = 0;


		for (int i = 0; i < inputStringArray.length; i++) {
			if (Character.isUpperCase(inputStringArray[i])) {
				countUpperCase++;
			}
		}
		return countUpperCase;
	}

	public int countLowerCaseCharacters(String inputString) {

		char[] inputStringArray;
		int countLowerCase;

		inputStringArray = inputString.toCharArray();
		countLowerCase = 0;

		for (int i = 0; i < inputStringArray.length; i++) {

			if (Character.isLowerCase(inputStringArray[i])) {
				countLowerCase++;
			}

		}

		return countLowerCase;
	}

}
