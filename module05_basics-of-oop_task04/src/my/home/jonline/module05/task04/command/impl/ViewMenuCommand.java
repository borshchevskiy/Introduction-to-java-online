package my.home.jonline.module05.task04.command.impl;

import my.home.jonline.module05.task04.command.Command;
import my.home.jonline.module05.task04.presentation.MenuViewer;
import my.home.jonline.module05.task04.presentation.ReaderProvider;
import my.home.jonline.module05.task04.presentation.UserInputReader;
import my.home.jonline.module05.task04.presentation.ViewerProvider;

public class ViewMenuCommand implements Command{

	private ViewerProvider viewerProvider = ViewerProvider.getInstance();
	private ReaderProvider readerProvider = ReaderProvider.getInstance();
	
	private MenuViewer menuViewer = viewerProvider.getMenuViewer();
	private UserInputReader userInputReader = readerProvider.getUserInputReader();
	
	@Override
	public String execute(String[] params) {
		menuViewer.viewMenu();
		String matcher = "[1234]";
		String userInput = userInputReader.readUserInput(true, matcher);
		
		return "viewSubMenu" + " " + userInput;
	}

}
