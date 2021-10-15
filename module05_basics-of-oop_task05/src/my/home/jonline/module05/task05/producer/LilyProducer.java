package my.home.jonline.module05.task05.producer;

import my.home.jonline.module05.task05.entity.Flower;
import my.home.jonline.module05.task05.entity.Lily;

public class LilyProducer implements FlowerProducer {

	@Override
	public Flower produceFlower(String flowerColor) {

		return new Lily(flowerColor);
	}

}
