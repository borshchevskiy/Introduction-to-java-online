package my.home.jonline.module05.task05.service;

import my.home.jonline.module05.task05.builder.CompositionBuilder;
import my.home.jonline.module05.task05.entity.Flower;
import my.home.jonline.module05.task05.entity.FlowerComposition;
import my.home.jonline.module05.task05.entity.FlowerWrapping;
import my.home.jonline.module05.task05.producer.*;
import my.home.jonline.module05.task05.view.FlowerCompositionViewer;
import my.home.jonline.module05.task05.view.MessageViewer;
import my.home.jonline.module05.task05.view.ViewerProvider;

public class RequestProcessor {

	private CompositionBuilder compositionBuilder = CompositionBuilder.getInstance();
	private FlowerProducerProvider provider = FlowerProducerProvider.getInstance();
	private ViewerProvider viewerProvider = ViewerProvider.getInstance();
	private MessageViewer messageViewer = viewerProvider.getMessageViewer();
	private FlowerCompositionViewer flowerCompositionViewer = viewerProvider.getFlowerCompositionViewer();

	private RequestValidator validator = new RequestValidator();
	private FlowerProducer flowerProducer;

	public void processRequest(String[] compositionItems) {
		String[] values;

		compositionBuilder.reset();

		for (String compositionItem : compositionItems) {
			values = compositionItem.split("=");

			if (values[0].matches("(flower\\d+)")) {

				String[] flowerParams = values[1].split("\\+");

				String flowerName = flowerParams[0];
				if (!validator.validateFlower(flowerName)) {
					return;
				}

				String flowerColor = flowerParams[1];

				int flowerQuantity = validator.validateFlowerQuantity(flowerParams[2]);
				if (flowerQuantity < 0) {
					return;
				}

				flowerProducer = provider.chooseProducer(flowerName);

				if (flowerProducer == null) {
					messageViewer.viewMessage("Can't add flower " + flowerName + "!");
					return;
				}

				for (int i = 0; i < flowerQuantity; i++) {					
					Flower flower = flowerProducer.produceFlower(flowerColor);					
					compositionBuilder.addFlower(flower);
				}

			}
			if (values[0].matches("wrapping")) {

				String[] wrappings = values[1].split("\\+");

				if (!validator.validateWrapping(wrappings[0])) {
					return;
				}

				compositionBuilder.setWrapping(new FlowerWrapping(wrappings[0], wrappings[1]));

			}
		}
		FlowerComposition flowerComposition = compositionBuilder.getResult();
		flowerCompositionViewer.viewFlowerComposition(flowerComposition);
	}

}
