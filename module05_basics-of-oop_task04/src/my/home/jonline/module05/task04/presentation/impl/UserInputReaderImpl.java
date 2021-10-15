package my.home.jonline.module05.task04.presentation.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import my.home.jonline.module05.task04.presentation.MessageViewer;
import my.home.jonline.module05.task04.presentation.ReaderProvider;
import my.home.jonline.module05.task04.presentation.UserInputReader;
import my.home.jonline.module05.task04.presentation.UserInputValidator;
import my.home.jonline.module05.task04.presentation.ViewerProvider;

public class UserInputReaderImpl implements UserInputReader {

	@Override
	public String readUserInput(boolean validate, String matcher) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		ReaderProvider readerProvider = ReaderProvider.getInstance();
		ViewerProvider viewerProvider = ViewerProvider.getInstance();

		UserInputValidator userInputValidator = readerProvider.getUserInputValidator();
		MessageViewer messageViewer = viewerProvider.getMessageViewer();

		String input = "";
		String inputMatch = "";
		if (validate) {
			inputMatch = matcher;
		}

		boolean validationResult;

		while (true) {
			try {
				input = reader.readLine();
				
				if (validate) {
					validationResult = userInputValidator.validate(input, inputMatch);
					
					if (!validationResult) {
						messageViewer.viewMessage("Wrong input! Try again:");
						continue;
					}

				}
				break;
			} catch (Exception e) {
				// logging
				messageViewer.viewMessage("Wrong input! Try again:");
			}
		}
		return input;
	}

}
