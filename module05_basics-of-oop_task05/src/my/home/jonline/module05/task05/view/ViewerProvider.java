package my.home.jonline.module05.task05.view;

public class ViewerProvider {
	private final static ViewerProvider instance = new ViewerProvider();

	private MessageViewer messageViewer = new MessageViewer();
	private FlowerCompositionViewer flowerCompositionViewer = new FlowerCompositionViewer();

	private ViewerProvider() {

	}

	public static ViewerProvider getInstance() {
		return instance;
	}

	public MessageViewer getMessageViewer() {
		return messageViewer;
	}

	public FlowerCompositionViewer getFlowerCompositionViewer() {
		return flowerCompositionViewer;
	}

}
