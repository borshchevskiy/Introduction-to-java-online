package my.home.jonline.module05.task04.presentation;

import my.home.jonline.module05.task04.presentation.impl.UserInputReaderImpl;
import my.home.jonline.module05.task04.presentation.impl.UserInputValidatorImpl;

public class ReaderProvider {
	private final static ReaderProvider instance = new ReaderProvider();

	private UserInputReader userInputReader = new UserInputReaderImpl();
	private UserInputValidator userInputValidator = new UserInputValidatorImpl();
	
	private ReaderProvider() {

	}

	public static ReaderProvider getInstance() {
		return instance;
	}

	public UserInputReader getUserInputReader() {
		return userInputReader;
	}

	public UserInputValidator getUserInputValidator() {
		return userInputValidator;
	}

	
}
