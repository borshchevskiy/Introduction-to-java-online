package my.home.jonline.module05.task04.command.impl;

import my.home.jonline.module05.task04.command.Command;
import my.home.jonline.module05.task04.presentation.MessageViewer;
import my.home.jonline.module05.task04.presentation.ReaderProvider;
import my.home.jonline.module05.task04.presentation.UserInputReader;
import my.home.jonline.module05.task04.presentation.ViewerProvider;

public class ViewSubMenuCommand implements Command {

	
	private ViewerProvider viewerProvider = ViewerProvider.getInstance();
	private ReaderProvider readerProvider = ReaderProvider.getInstance();
	private MessageViewer messageViewer = viewerProvider.getMessageViewer();
	private UserInputReader userInputReader = readerProvider.getUserInputReader();
	
	@Override
	public String execute(String[] params) {
		String subMenu = params[1];
		switch (subMenu) {
		case "1":
			return "viewAllTreasures";			
		case "2":
			return "findMostValuableTreasure";
		case "3":
			messageViewer.viewMessage("Input total treasure value:");
			String matcher = "[0-9]+";
			String request = userInputReader.readUserInput(true, matcher);
			return "findTreasureByTotalValue" + " " + request;
		default:
			return "exit";
		}
	}

}
