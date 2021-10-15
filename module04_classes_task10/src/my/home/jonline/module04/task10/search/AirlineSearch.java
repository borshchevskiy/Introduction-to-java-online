package my.home.jonline.module04.task10.search;

import java.util.ArrayList;
import java.util.List;

import my.home.jonline.module04.task10.entity.Airline;
import my.home.jonline.module04.task10.entity.DaysOfWeek;
import my.home.jonline.module04.task10.entity.DepartureTime;

public class AirlineSearch {

	public List<Airline> searchByDestination(List<Airline> airlines, String destination) {
		List<Airline> result;
		
		result = new ArrayList<>();
		
		for (Airline airline : airlines) {
			if (airline.getDestination().equals(destination) ) {
				result.add(airline);
			}
		}
		
		return result;
	}
	
	public List<Airline> searchByDayOfWeek(List<Airline> airlines, DaysOfWeek dayOfWeek) {
		List<Airline> result;
		
		result = new ArrayList<>();
		
		for (Airline airline : airlines) {
			for (DaysOfWeek day : airline.getDepartureDays()) {
				if (day == dayOfWeek) {
					result.add(airline);
				}
			}
				
			
		}
		
		return result;
	}
	
	public List<Airline> searchByDayAndTime(List<Airline> airlines, DaysOfWeek dayOfWeek, DepartureTime departureTime) {
		List<Airline> result;
		
		result = new ArrayList<>();
		
		for (Airline airline : airlines) {
			for (DaysOfWeek day : airline.getDepartureDays()) {
				if (day == dayOfWeek && airline.getDepartureTime().compareTo(departureTime) == 1) {
					result.add(airline);
				}
			}
				
			
		}
		
		return result;
	}
}
