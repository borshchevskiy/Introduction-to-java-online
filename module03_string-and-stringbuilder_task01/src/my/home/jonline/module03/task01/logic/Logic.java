package my.home.jonline.module03.task01.logic;

public class Logic {

	public int countConsecutiveSpace(String inputString) {
		int numberOfConsecutiveSpaces;
		int maximumOfConsecutiveSpaces;

		numberOfConsecutiveSpaces = 0;
		maximumOfConsecutiveSpaces = 0;

		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == ' ') {
				numberOfConsecutiveSpaces++;
				if (numberOfConsecutiveSpaces > maximumOfConsecutiveSpaces) {
					maximumOfConsecutiveSpaces = numberOfConsecutiveSpaces;
				}
			} else {
				numberOfConsecutiveSpaces = 0;
			}
		}
		return maximumOfConsecutiveSpaces;
	}
}
