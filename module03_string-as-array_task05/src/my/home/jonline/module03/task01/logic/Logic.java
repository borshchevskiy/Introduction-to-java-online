package my.home.jonline.module03.task01.logic;

public class Logic {

	public String removeSpaces(String inputString) {
		String result;

		result = inputString.trim().replaceAll(" ", "");

		return result;

	}

	public String removeSpacesWithCharArray(String inputString) {
		String result;
		char[] inputStringChars;
		char[] resultStringChars;
		int numberOfSpaces;
		int resultStringIndexPointer;

		result = "";
		inputStringChars = inputString.toCharArray();
		numberOfSpaces = countSpaces(inputString);
		resultStringChars = new char[inputStringChars.length - numberOfSpaces];
		resultStringIndexPointer = 0;

		for (int i = 0; i < inputStringChars.length; i++) {
			if (inputStringChars[i] == ' ') {
				resultStringIndexPointer++;
			} else {
				resultStringChars[i - resultStringIndexPointer] = inputStringChars[i];
			}
		}
		result = new String(resultStringChars);

		return result;

	}

	public int countSpaces(String inputString) {
		int result;
		char[] inputStringChars;

		result = 0;
		inputStringChars = inputString.toCharArray();

		for (char c : inputStringChars) {
			if (c == ' ') {
				result++;
			}
		}

		return result;
	}
}
