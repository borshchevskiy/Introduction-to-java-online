package my.home.jonline.module05.task05.builder;

import java.util.List;

import my.home.jonline.module05.task05.entity.Flower;
import my.home.jonline.module05.task05.entity.FlowerComposition;
import my.home.jonline.module05.task05.entity.FlowerWrapping;

public class CompositionBuilder {
	private final static CompositionBuilder instance = new CompositionBuilder();
	
	private CompositionBuilder() {
		
	}	
	
	private FlowerComposition flowerComposition = new FlowerComposition();
	
	public static CompositionBuilder getInstance() {
		return instance;
	}
	
	public void reset() {
		flowerComposition = new FlowerComposition();
	}
	
	public FlowerComposition getResult() {
		return flowerComposition;
	}
	
	public void setFlowers(List<Flower> flowers) {
		flowerComposition.setFlowers(flowers);
	}
	
	public void addFlowers(List<Flower> flowers) {
		flowerComposition.getFlowers().addAll(flowers);
	}
	
	public void addFlower(Flower flower) {
		flowerComposition.getFlowers().add(flower);
	}
	
	public void setWrapping(FlowerWrapping wrapping) {
		flowerComposition.setWrapping(wrapping);
	}
	

}
