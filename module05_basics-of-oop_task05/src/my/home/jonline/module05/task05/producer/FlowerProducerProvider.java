package my.home.jonline.module05.task05.producer;

public class FlowerProducerProvider {

	private final static FlowerProducerProvider instance = new FlowerProducerProvider();

	private FlowerProducer roseProducer = new RoseProducer();
	private FlowerProducer tulipProducer = new TulipProducer();
	private FlowerProducer lilyProducer = new LilyProducer();

	private FlowerProducerProvider() {

	}

	public static FlowerProducerProvider getInstance() {
		return instance;
	}

	public FlowerProducer chooseProducer(String flowerName) {
		switch (flowerName) {
		case "rose":
			return roseProducer;
		case "tulip":
			return tulipProducer;
		case "lily":
			return lilyProducer;
		default:
			return null;

		}
	}
}
