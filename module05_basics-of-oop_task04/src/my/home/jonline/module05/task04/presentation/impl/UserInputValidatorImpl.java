package my.home.jonline.module05.task04.presentation.impl;

import my.home.jonline.module05.task04.presentation.UserInputValidator;

public class UserInputValidatorImpl implements UserInputValidator{

	
	@Override
	public boolean validate(String input, String match) {
		if (input.equals(null) || match.equals(null)) {
			return false;
		}
		return input.matches(match);
		
	}

}
