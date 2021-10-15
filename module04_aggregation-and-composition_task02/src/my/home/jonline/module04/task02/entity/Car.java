package my.home.jonline.module04.task02.entity;

import java.util.Arrays;

import my.home.jonline.module04.task02.userinput.UserInput;
import my.home.jonline.module04.task02.view.View;

public class Car {

	private String color;
	private String brand;
	private Engine engine;
	private Wheel[] wheels;
	private int fuel;
	private final int maxFuel = 50;
	
	public Car() {
		
	}

	public Car(String color, String brand, double engineVolume, int engineCylinders, int numberOfwheels, int wheelSize) {
		this.color = color;
		this.brand = brand;
		this.engine = new Engine(engineVolume, engineCylinders);
		this.wheels = new Wheel[numberOfwheels];
		for (int i = 0; i < this.wheels.length; i++) {
			this.wheels[i] = new Wheel(wheelSize);
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	
	public void ride() {
		View view = new View();
		view.showMessage("Car is riding.");
		engine.engineStart();
	}
	
	public void stop() {
		View view = new View();
		view.showMessage("Car stopped.");
		engine.engineStop();
	}
	
	
	public void fuelUp(int litres) {
		View view = new View();
		
		getEngine().engineStop();
		
		fuel += litres;
		if (fuel > maxFuel) {
			fuel = maxFuel;
		}
		view.showMessage("Car is fueled.");
	}
	
	public void changeWheel() {
		int wheelNumber;
		UserInput userInput = new UserInput();
		View view = new View();
		
		wheelNumber = userInput.getWheelNumber(wheels);
		
		view.showMessage("Колесо " + wheelNumber + " заменено.");
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + Arrays.hashCode(wheels);
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
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (!Arrays.equals(wheels, other.wheels))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Car [color=" + color + ", brand=" + brand + ", engine=" + engine + ", wheels=" + Arrays.toString(wheels)
				+ "]";
	}
	
	
	
}
