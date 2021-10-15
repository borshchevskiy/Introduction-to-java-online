package my.home.jonline.module03.task06.logic;

public class Logic {

	public String doubleCharactersInString(String inputString) {
		StringBuilder stringBuilder;
		String result;

		stringBuilder = new StringBuilder("");
		
		for (int i = 0; i < inputString.length(); i++) {

			stringBuilder.append(inputString.charAt(i));
			stringBuilder.append(inputString.charAt(i));
		}
		
		result = new String(stringBuilder);

		return result;
	}

}
