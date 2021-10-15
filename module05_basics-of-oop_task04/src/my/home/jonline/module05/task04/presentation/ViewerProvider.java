package my.home.jonline.module05.task04.presentation;

import my.home.jonline.module05.task04.presentation.impl.MenuViewerImpl;
import my.home.jonline.module05.task04.presentation.impl.MessageViewerImpl;
import my.home.jonline.module05.task04.presentation.impl.UserActionViewerImpl;

public class ViewerProvider {
	private final static ViewerProvider instance = new ViewerProvider();

	private MenuViewer menuViewer = new MenuViewerImpl();
	private MessageViewer messageViewer = new MessageViewerImpl();
	private UserActionViewer userActionViewer = new UserActionViewerImpl();
	
	private ViewerProvider() {

	}

	public static ViewerProvider getInstance() {
		return instance;
	}

	public MenuViewer getMenuViewer() {
		return menuViewer;
	}

	public MessageViewer getMessageViewer() {
		return messageViewer;
	}

	public UserActionViewer getUserActionViewer() {
		return userActionViewer;
	}
	
	
	
}
