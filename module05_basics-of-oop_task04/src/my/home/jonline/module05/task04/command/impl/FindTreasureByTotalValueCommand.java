package my.home.jonline.module05.task04.command.impl;

import java.util.List;

import my.home.jonline.module05.task04.bean.Treasure;
import my.home.jonline.module05.task04.command.Command;
import my.home.jonline.module05.task04.presentation.MessageViewer;
import my.home.jonline.module05.task04.presentation.UserActionViewer;
import my.home.jonline.module05.task04.presentation.ViewerProvider;
import my.home.jonline.module05.task04.service.CaveService;
import my.home.jonline.module05.task04.service.ServiceProvider;
import my.home.jonline.module05.task04.service.TreasureListResponse;
import my.home.jonline.module05.task04.service.exception.ServiceException;

public class FindTreasureByTotalValueCommand implements Command {

	@Override
	public String execute(String[] params) {
		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		ViewerProvider viewerProvider = ViewerProvider.getInstance();
		CaveService caveService = serviceProvider.getCaveService();
		
		TreasureListResponse result = new TreasureListResponse();
		
		int totalValue = Integer.parseInt(params[1]);
		
		try {
			result = caveService.getTreasuresByTotalValue(totalValue);
		} catch (ServiceException e) {
			// logging
			MessageViewer messageViewer = viewerProvider.getMessageViewer();
			messageViewer.viewMessage("Error has occured!");
		}
		
		List<Treasure> treasures = result.getTreasure();
		String message = result.getMessage();

		if (!message.isBlank()) {
			MessageViewer messageViewer = viewerProvider.getMessageViewer();
			messageViewer.viewMessage(message);
		}

		UserActionViewer userActionViewer = viewerProvider.getUserActionViewer();
		userActionViewer.viewActionResult(treasures);
		
		return "";
	}

}
