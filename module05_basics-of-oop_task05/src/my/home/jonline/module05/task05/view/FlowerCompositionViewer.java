package my.home.jonline.module05.task05.view;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import my.home.jonline.module05.task05.entity.Flower;
import my.home.jonline.module05.task05.entity.FlowerComposition;

public class FlowerCompositionViewer {
	public void viewFlowerComposition(FlowerComposition flowerComposition) {
		Set<Flower> flowers = new HashSet<Flower>();
		flowers.addAll(flowerComposition.getFlowers());

		System.out.println("Flower composition of:");
		for (Flower flower : flowers) {
			System.out.println(flower.getColor() + " " + flower.getClass().getSimpleName().toLowerCase() + " x "
					+ Collections.frequency(flowerComposition.getFlowers(), flower));
		}

		if (flowerComposition.getWrapping().getType().isBlank()) {
			System.out.println("without wrapping.");
		} else {
			System.out.println(
					"in " + flowerComposition.getWrapping().getColor() + " " + flowerComposition.getWrapping().getType());
		}
	}
}
