package my.home.jonline.module05.task05.service;

import my.home.jonline.module05.task05.view.MessageViewer;
import my.home.jonline.module05.task05.view.ViewerProvider;

public class CompositionMaker {
	private ViewerProvider viewerProvider = ViewerProvider.getInstance();
	private MessageViewer messageViewer = viewerProvider.getMessageViewer();

	public void getRequest(String request) {

		if (request == null || request.isBlank()) {
			messageViewer.viewMessage("Empty request!");
		}

		String[] compositionItems = request.split("&");

		if (compositionItems.length == 0) {
			messageViewer.viewMessage("Wrong request!");
		}

		processRequest(compositionItems);

	}

	private void processRequest(String[] params) {
		RequestProcessor processor = new RequestProcessor();
		processor.processRequest(params);
	}

}
