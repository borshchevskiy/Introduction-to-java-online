package my.home.jonline.module03.task01.logic;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logic {

		
	public String sortParagraphsBySentenceCount(String inputString) {
		String[] paragraphs;

		int[] sentencesCount;// stores number of sentences in each paragraph. Index of array = index of
		// paragraph in []paragraphs
		String result;

		paragraphs = splitTextToParagraphs(inputString);
		sentencesCount = countSentencesInParagraphsArray(paragraphs);

		sortByFrequencyAscending(paragraphs, sentencesCount);

		result = compileParagraphsToText(paragraphs);

		return result;
	}

	public String sortWordsByLength(String inputString) {
		String text;
		String[] sentences;
		String[][] words;// rows are sentences, each column is a separate word of a sentence

		sentences = splitTextToSentences(inputString);
		words = splitSentencesToWords(sentences);

		for (String[] iteration : words) {
			sortByLength(iteration);
		}

		text = compileWordsToText(words);

		return text;
	}

	public String sortLexemesByCharacterFrequency(String inputString, char ch) {
		String text;
		String[] sentences;
		String[][] words;
		int[] characterFrequency;

		sentences = splitTextToSentences(inputString);
		words = splitSentencesToWords(sentences);

		for (String[] iteration : words) {
			characterFrequency = new int[iteration.length];
			characterFrequency = countCharactersFrequency(iteration, ch);
			sortByFrequencyDescendingAndNatural(iteration, characterFrequency);
		}

		text = compileWordsToText(words);

		return text;
	}

	private int[] countCharactersFrequency(String[] words, char ch) {
		int[] frequency;

		frequency = new int[words.length];

		for (int i = 0; i < words.length; i++) {
			int count = 0;
			char[] word = words[i].toCharArray();
			for (char c : word) {
				if (c == ch) {
					count++;
				}
			}
			frequency[i] = count;
		}

		return frequency;

	}

	private void sortByLength(String[] words) {

		for (int i = 0; i < words.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < words.length; j++) {
				if (words[j].length() < words[minIndex].length()) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				String temp = words[i];
				words[i] = words[minIndex];
				words[minIndex] = temp;
			}
		}

	}

	private void sortByFrequencyAscending(String[] tokens, int[] frequency) {
		for (int i = 0; i < frequency.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < frequency.length; j++) {
				if (frequency[j] < frequency[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = frequency[i];
				frequency[i] = frequency[minIndex];
				frequency[minIndex] = temp;

				String tempString = tokens[i];
				tokens[i] = tokens[minIndex];
				tokens[minIndex] = tempString;
			}
		}
	}

	private void sortByFrequencyDescendingAndNatural(String[] tokens, int[] frequency) {
		int from;
		int count;

		from = 0;
		count = 0;

		
		for (int i = 0; i < frequency.length - 1; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < frequency.length; j++) {
				if (frequency[j] > frequency[maxIndex]) {
					maxIndex = j;
				}
			}
			if (maxIndex != i) {
				int temp = frequency[i];
				frequency[i] = frequency[maxIndex];
				frequency[maxIndex] = temp;

				String tempString = tokens[i];
				tokens[i] = tokens[maxIndex];
				tokens[maxIndex] = tempString;
			}
		}

		// find a range with equal frequency and sort this range with natural order
		for (int i = 0; i < frequency.length - 1; i++) {
			if (frequency[i] == frequency[i + 1]) {
				from = i + 1;
				count++;
			} else {
				if (count > 0) {
					Arrays.sort(tokens, from - count, i + 1);
				}
				from = 0;
				count = 0;
			}

		}

	}

	private String[] splitTextToParagraphs(String inputString) {
		String[] paragraphs;

		paragraphs = inputString.trim().split("\t");

		return paragraphs;
	}

	private String[] splitTextToSentences(String inputString) {
		String[] sentences;

		sentences = inputString.split("(?<=([а-яА-Я0-9»][.!?]+))[\s\n\r]+(?!—)");

		return sentences;
	}

	private String[][] splitSentencesToWords(String[] sentences) {
		String[][] words;

		words = new String[sentences.length][];

		// fill words[] with sentences splitted into separate words, punctuation is
		// omitted;
		for (int i = 0; i < sentences.length; i++) {

			words[i] = sentences[i].trim().split("[\s.,!?—:;]+");

		}

		return words;
	}

	private int[] countSentencesInParagraphsArray(String[] paragraphs) {
		Pattern pattern;
		Matcher matcher;
		int[] sentencesCount;
		String patternString;
		int count;

		patternString = "([.!?]+)([\\s\\n]+)([^—][А-Я])*";// pattern for the end of sentence
		pattern = Pattern.compile(patternString);
		sentencesCount = new int[paragraphs.length];

		for (int i = 0; i < paragraphs.length; i++) {
			count = 0;
			matcher = pattern.matcher(paragraphs[i]);

			while (matcher.find()) {
				count++;
			}
			sentencesCount[i] = count;
		}

		return sentencesCount;
	}

	private String compileWordsToText(String[][] words) {
		String[] sentences;
		String text;

		sentences = new String[words.length];
		text = "";

		for (int i = 0; i < words.length; i++) {
			sentences[i] = words[i][0];
			for (int j = 1; j < words[i].length; j++) {
				sentences[i] += " " + words[i][j];
			}
		}

		text = sentences[0];

		for (int i = 1; i < sentences.length; i++) {
			text += "\r\n" + sentences[i];
		}

		return text;
	}

	private String compileParagraphsToText(String[] paragraphs) {
		String result;

		result = "";

		for (String string : paragraphs) {
			result = result + "\t" + string + "\r\n";
		}

		return result;
	}

}
