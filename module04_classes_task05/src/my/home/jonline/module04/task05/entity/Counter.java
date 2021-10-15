package my.home.jonline.module04.task05.entity;

public class Counter {

	private int maxValue;
	private int minValue;
	private int currentValue;

	public Counter() {
		this(0, 10, 0);
	}
	
	public Counter(int min, int max) {
		this(min, max, min);		
	}
	
	public Counter(int min, int max, int current) {

		if (max < min) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		
		this.minValue = min;
		this.maxValue = max;
		this.currentValue = current;
		
		if (current < min)
			this.currentValue = min;
		if (current > max)
			this.currentValue = max;
	}
	
	

	public void increment() {
		if (currentValue == maxValue) {
			currentValue = minValue;
		} else {
			currentValue++;
		}
	}

	public void decrement() {
		if (currentValue == minValue) {
			currentValue = maxValue;
		} else {
			currentValue--;
		}
	}

	public int getCurrentValue() {
		return currentValue;
	}
	
	public int getMaxValue() {
		return maxValue;
	}
	
	public int getMinValue() {
		return minValue;
	}

	@Override
	public String toString() {
		return "Counter [maxValue=" + maxValue + ", minValue=" + minValue + ", currentValue=" + currentValue + "]";
	}

	
	
}
