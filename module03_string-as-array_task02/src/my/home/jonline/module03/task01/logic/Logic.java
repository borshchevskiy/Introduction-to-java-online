package my.home.jonline.module03.task01.logic;


public class Logic {

	public String replaceWordWithLetter(String inputString, String stringToReplace, String stringReplaceWith) {
		String result = "";
		
		if (inputString.contains(stringToReplace)) {
			result = inputString.replaceAll(stringToReplace, stringReplaceWith);
		}
		return result;

	}
	
}
