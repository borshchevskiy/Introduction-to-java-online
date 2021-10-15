package my.home.jonline.module05.task04.presentation.impl;

import my.home.jonline.module05.task04.presentation.MessageViewer;

public class MessageViewerImpl implements MessageViewer{

	@Override
	public void viewMessage(String message) {
		System.out.println(message);
		
	}

}
