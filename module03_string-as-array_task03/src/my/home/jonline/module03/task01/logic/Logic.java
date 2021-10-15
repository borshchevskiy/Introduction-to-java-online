package my.home.jonline.module03.task01.logic;


public class Logic {

	public int countNumberOfDigits(String inputString) {
		int result = 0;
		char[] stringChars;
		
		stringChars = inputString.toCharArray();
		
		for (char c : stringChars) {
			if (Character.isDigit(c)) {
				result++;
			}
		}
		
		return result;

	}
	
}
