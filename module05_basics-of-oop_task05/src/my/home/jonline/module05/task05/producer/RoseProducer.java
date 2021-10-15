package my.home.jonline.module05.task05.producer;

import my.home.jonline.module05.task05.entity.Flower;
import my.home.jonline.module05.task05.entity.Rose;

public class RoseProducer implements FlowerProducer{

	@Override
	public Flower produceFlower(String flowerColor) {
		// TODO Auto-generated method stub
		return new Rose(flowerColor);
	}

}
