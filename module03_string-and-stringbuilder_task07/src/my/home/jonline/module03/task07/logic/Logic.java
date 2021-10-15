package my.home.jonline.module03.task07.logic;


public class Logic {

	public String removeSpacesAndDoubles(String inputString) {
		String result;
		String input;		
		String[] inputStringArray;

		result = "";
		input = inputString.replaceAll(" ", "");				
		inputStringArray = input.split("");

		for (int i = 0; i < inputStringArray.length; i++) {
			if (!result.contains(inputStringArray[i])) {
				result = result.concat(inputStringArray[i]);
			}
		}
		

		return result;
	}

}
