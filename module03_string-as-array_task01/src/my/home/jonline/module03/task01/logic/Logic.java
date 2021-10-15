package my.home.jonline.module03.task01.logic;


public class Logic {

	public String[] camelToSnake(String[] strings) {
		String[] resultArray;
		char[] originalStringChars;
		char[] resultStringChars;
		int numberOfUppercase;
		int resultStringIndexPointer;

		resultArray = new String[strings.length];

		for (int i = 0; i < strings.length; i++) {

			originalStringChars = strings[i].toCharArray();
			numberOfUppercase = countUpperCase(strings[i]);
			resultStringChars = new char[strings[i].length() + numberOfUppercase];
			resultStringIndexPointer = 0;

			for (int j = 0; j < originalStringChars.length; j++) {
				if (Character.isUpperCase(originalStringChars[j])) {
					resultStringChars[j + resultStringIndexPointer] = '_';
					resultStringIndexPointer++;
					resultStringChars[j + resultStringIndexPointer] = Character.toLowerCase(originalStringChars[j]);
				} else {
					resultStringChars[j + resultStringIndexPointer] = originalStringChars[j];
				}
			}
			resultArray[i] = new String(resultStringChars);
		}

		return resultArray;

	}

	private int countUpperCase(String string) {
		char[] chars;
		int numberOfUppercases;

		chars = string.toCharArray();
		numberOfUppercases = 0;

		for (int i = 0; i < chars.length; i++) {
			if (Character.isUpperCase(chars[i])) {
				numberOfUppercases++;
			}
		}

		return numberOfUppercases;
	}
}
