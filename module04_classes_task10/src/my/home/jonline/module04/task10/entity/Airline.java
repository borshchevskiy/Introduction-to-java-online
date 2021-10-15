package my.home.jonline.module04.task10.entity;

import java.util.Arrays;

public class Airline {

	private String destination;
	private String flightNumber;
	private String aircraftType;
	private DepartureTime departureTime;
	private DaysOfWeek[] departureDays;
	
	
	public Airline() {
		
	}


	public Airline(String destination, String flightNumber, String aircraftType, DepartureTime departureTime,
			DaysOfWeek[] departureDays) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.departureTime = departureTime;
		this.departureDays = departureDays;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}


	public String getAircraftType() {
		return aircraftType;
	}


	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}


	public DepartureTime getDepartureTime() {
		return departureTime;
	}


	public void setDepartureTime(DepartureTime departureTime) {
		this.departureTime = departureTime;
	}


	public DaysOfWeek[] getDepartureDays() {
		return departureDays;
	}


	public void setDepartureDays(DaysOfWeek[] departureDays) {
		this.departureDays = departureDays;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aircraftType == null) ? 0 : aircraftType.hashCode());
		result = prime * result + Arrays.hashCode(departureDays);
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((flightNumber == null) ? 0 : flightNumber.hashCode());
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
		Airline other = (Airline) obj;
		if (aircraftType == null) {
			if (other.aircraftType != null)
				return false;
		} else if (!aircraftType.equals(other.aircraftType))
			return false;
		if (!Arrays.equals(departureDays, other.departureDays))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber == null) {
			if (other.flightNumber != null)
				return false;
		} else if (!flightNumber.equals(other.flightNumber))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", aircraftType="
				+ aircraftType + ", departureTime=" + departureTime + ", departureDays="
				+ Arrays.toString(departureDays) + "]";
	}
	
	
	
}
