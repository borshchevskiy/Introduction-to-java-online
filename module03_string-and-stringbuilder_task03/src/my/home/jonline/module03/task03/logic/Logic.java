package my.home.jonline.module03.task03.logic;

public class Logic {

	public boolean isPalindrome(String inputString) {

		int frontPointer;
		int tailPointer;

		frontPointer = 0;
		tailPointer = inputString.length() - 1;

		while (frontPointer <= tailPointer) {
			if (inputString.charAt(frontPointer) != inputString.charAt(tailPointer)) {
				return false;
			} else {
				frontPointer++;
				tailPointer--;
			}
		}
		return true;
	}

	
	
	public boolean isPalindromeStringBuilder(String inputString) {

		StringBuilder stringBuilder = new StringBuilder(inputString);

		stringBuilder = stringBuilder.reverse();

		return stringBuilder.toString().equals(inputString);	
		
		 
	}
}
