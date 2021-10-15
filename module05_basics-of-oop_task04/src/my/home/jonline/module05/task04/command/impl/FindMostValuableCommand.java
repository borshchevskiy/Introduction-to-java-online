package my.home.jonline.module05.task04.command.impl;

import my.home.jonline.module05.task04.bean.Treasure;
import my.home.jonline.module05.task04.command.Command;
import my.home.jonline.module05.task04.presentation.MessageViewer;
import my.home.jonline.module05.task04.presentation.UserActionViewer;
import my.home.jonline.module05.task04.presentation.ViewerProvider;
import my.home.jonline.module05.task04.service.CaveService;
import my.home.jonline.module05.task04.service.ServiceProvider;
import my.home.jonline.module05.task04.service.TreasureResponse;
import my.home.jonline.module05.task04.service.exception.ServiceException;

public class FindMostValuableCommand implements Command {

	@Override
	public String execute(String[] params) {
		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		ViewerProvider viewerProvider = ViewerProvider.getInstance();
		CaveService caveService = serviceProvider.getCaveService();

		
		TreasureResponse result = new TreasureResponse();
		try {
			result = caveService.getMostValuableTreasure();
		} catch (ServiceException e) {
			// logging
			MessageViewer messageViewer = viewerProvider.getMessageViewer();
			messageViewer.viewMessage("Error has occured!");
		}

		Treasure treasure = result.getTreasure();
		String message = result.getMessage();

		if (!message.isBlank()) {
			MessageViewer messageViewer = viewerProvider.getMessageViewer();
			messageViewer.viewMessage(message);
		}

		UserActionViewer userActionViewer = viewerProvider.getUserActionViewer();
		userActionViewer.viewActionResult(treasure);
		
		return "";
	}

}
