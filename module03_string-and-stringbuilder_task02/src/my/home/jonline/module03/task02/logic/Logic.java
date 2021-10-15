package my.home.jonline.module03.task02.logic;

public class Logic {

	public String insertAAfterB(String inputString) {
		String resultString;		

		StringBuilder sb = new StringBuilder("");
		
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == 'a') {
				sb.append(inputString.charAt(i));
				sb.append('b');
			} else {
				sb.append(inputString.charAt(i));
			}
		}	

		resultString = new String(sb);
		
		return resultString;
	}
}
