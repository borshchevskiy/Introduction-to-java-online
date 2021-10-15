package my.home.jonline.module03.task08.logic;


public class Logic {

	public String findLongestWord(String inputString) {
		String result;		
		String[] inputStringArray;
		int maxLength;

		result = "";				
		inputStringArray = inputString.split(" ");
		maxLength = inputStringArray[0].length();

		for (int i = 1; i < inputStringArray.length; i++) {
			if (inputStringArray[i].length() > maxLength) {
				maxLength = inputStringArray[i].length();
				result = inputStringArray[i];
			}
		}		

		return result;
	}

}
