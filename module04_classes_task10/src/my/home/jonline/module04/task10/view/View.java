package my.home.jonline.module04.task10.view;

import java.util.List;

import my.home.jonline.module04.task10.entity.Airline;
import my.home.jonline.module04.task10.entity.DaysOfWeek;

public class View {

	public void viewAirline(Airline airline) {
		System.out.print("Flight " + airline.getFlightNumber() + " to " + airline.getDestination() + "; "
				+ airline.getDepartureTime().getTime() + "; ");

		viewDaysOfWeek(airline.getDepartureDays());

		System.out.print(" aircraft type: " + airline.getAircraftType());
		System.out.println();
	}

	public void viewAirlines(List<Airline> airlines) {
		for (Airline airline : airlines) {
			viewAirline(airline);
		}
		System.out.println();
	}

	private void viewDaysOfWeek(DaysOfWeek[] daysOfWeek) {
		System.out.print("flight days:");
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for (DaysOfWeek day : daysOfWeek) {
			stringBuilder.append(" ");
			stringBuilder.append(day.getText());
			stringBuilder.append(",");			
		}
		
		stringBuilder.deleteCharAt(stringBuilder.length()-1);
		stringBuilder.append(";");
		
		System.out.print(stringBuilder);
	}
}
