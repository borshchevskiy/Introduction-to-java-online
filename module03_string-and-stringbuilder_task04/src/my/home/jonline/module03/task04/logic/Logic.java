package my.home.jonline.module03.task04.logic;

public class Logic {

	public String convertString(String inputString, String requiredString) {
		String result;
		String nextChar;
		char requiredChar;
		char originalChar;
		char[] inputStringChars;

		result = "";
		inputStringChars = inputString.toCharArray();

		for (int i = 0; i < requiredString.length(); i++) {

			requiredChar = requiredString.charAt(i);

			for (int j = 0; j < inputString.length(); j++) {

				originalChar = inputString.charAt(j);

				if (originalChar == requiredChar) {

					nextChar = String.copyValueOf(inputStringChars, j, 1);

					result = result.concat(nextChar);
				}
			}
		}

		return result;
	}

}
