package my.home.jonline.module03.task02.logic;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import my.home.jonline.module03.task02.view.View;

public class Logic {

	{

	}

	public void parseXMLString(String inputString) {
		HashMap<String, String> matchHashMap;
		View view;
		String patternString;
		Pattern pattern;
		Matcher matcher;
		String parseResult;

		matchHashMap = new HashMap<>();
		matchHashMap.put("<[^<>\\//]+>", "Открывающий тэг");
		matchHashMap.put("</[^<>]+>", "Закрывающий тэг");
		matchHashMap.put("<[^<>]+/>", "Тэг без тела");
		matchHashMap.put("\\b.+\\b\\p{Punct}*", "Содержимое тэга");

		view = new View();

		patternString = "(</*[^<>]+/*>)|((?<=>).+(?=<))";// finds XML nodes
		pattern = Pattern.compile(patternString);
		matcher = pattern.matcher(inputString);

		// for each found node we check its type;
		while (matcher.find()) {
			parseResult = matcher.group();
			for (Entry<String, String> entry : matchHashMap.entrySet()) {
				if (parseResult.matches(entry.getKey())) {
					view.viewResult(entry.getValue() + ": " + parseResult);
				}
			}
		}

	}

}
