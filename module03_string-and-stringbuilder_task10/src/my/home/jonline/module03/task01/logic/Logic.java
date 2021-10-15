package my.home.jonline.module03.task01.logic;

public class Logic {

	public int countSentences(String inputString) {
		int count;
		char[] inputStringArray;

		inputStringArray = inputString.toCharArray();
		count = 0;

		for (int i = 0; i < inputStringArray.length; i++) {
			if (inputStringArray[i] == '.' | inputStringArray[i] == '!' | inputStringArray[i] == '?') {
				count++;
			}
		}
		return count;
	}

}
