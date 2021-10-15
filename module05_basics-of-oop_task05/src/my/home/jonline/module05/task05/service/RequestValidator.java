package my.home.jonline.module05.task05.service;

import java.util.HashSet;
import java.util.Set;

import my.home.jonline.module05.task05.view.MessageViewer;
import my.home.jonline.module05.task05.view.ViewerProvider;

public class RequestValidator {

	private ViewerProvider viewerProvider = ViewerProvider.getInstance();
	private MessageViewer messageViewer = viewerProvider.getMessageViewer();
	private Set<String> flowerSet = new HashSet<>();
	private Set<String> wrappingSet = new HashSet<>();

	{
		flowerSet.add("rose");
		flowerSet.add("tulip");
		flowerSet.add("lily");
		wrappingSet.add("paper");
		wrappingSet.add("plastic");
		wrappingSet.add("basket");
	}

	public boolean validateFlower(String flowerName) {
		if (!flowerSet.contains(flowerName)) {
			messageViewer.viewMessage("Flower " + flowerName + " is unavailable!");
			return false;
		}
		return true;
	}
	
	public boolean validateWrapping(String wrappingName) {
		if (!wrappingSet.contains(wrappingName)) {
			messageViewer.viewMessage("Wrapping " + wrappingName + " is unavailable!");
			return false;
		}
		return true;
	}

	public int validateFlowerQuantity(String flowerQuantity) {
		int quantity = Integer.parseInt(flowerQuantity);
		if (quantity <= 0) {
			messageViewer.viewMessage("Wrong quantity of flowers!");
			return -1;
		}
		return quantity;
	}
	
	
}
