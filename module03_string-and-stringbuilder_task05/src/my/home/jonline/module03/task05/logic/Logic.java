package my.home.jonline.module03.task05.logic;

public class Logic {

	public int countA(String inputString) {
		int result;
		char[] inputStringChars;

		result = 0;
		inputStringChars = inputString.toCharArray();

		for (int i = 0; i < inputStringChars.length; i++) {

			if (inputStringChars[i] == 'a') {

				result++;
			}
		}

		return result;
	}

}
