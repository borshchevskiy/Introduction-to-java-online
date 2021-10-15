package my.home.jonline.module04.task10.entity;

import java.util.ArrayList;
import java.util.List;

public class Airway {
	
	List<Airline> airlines = new ArrayList<>();
	
	public Airway() {
		airlines = new ArrayList<>();
	}
	
	public Airway(List<Airline> airlines) {
		this.airlines = airlines;
	}
	
	public void addAirline(Airline airline) {
		airlines.add(airline);
	}
	
	public void removeAirline(Airline airline) {
		airlines.remove(airline);
	}
	
	public List<Airline> getAirlines() {
		return airlines;
	}
}
