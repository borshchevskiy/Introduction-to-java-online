package my.home.jonline.module04.task02.entity;

public class Engine {

	private double volume;
	private int numberOfCylinders;
	private boolean isRunning;

	public Engine() {

	}

	public Engine(double volume, int numberOfCylinders) {
		this.volume = volume;
		this.numberOfCylinders = numberOfCylinders;
		this.isRunning = false;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	public void engineStart() {
		isRunning = true;
	}

	public void engineStop() {
		isRunning = false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isRunning ? 1231 : 1237);
		result = prime * result + numberOfCylinders;
		long temp;
		temp = Double.doubleToLongBits(volume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		if (isRunning != other.isRunning)
			return false;
		if (numberOfCylinders != other.numberOfCylinders)
			return false;
		if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Engine [volume=" + volume + ", numberOfCylinders=" + numberOfCylinders + "]";
	}

}
