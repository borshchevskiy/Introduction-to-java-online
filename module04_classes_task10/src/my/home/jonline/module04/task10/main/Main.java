package my.home.jonline.module04.task10.main;

import java.util.List;

import my.home.jonline.module04.task10.entity.Airline;
import my.home.jonline.module04.task10.entity.Airway;
import my.home.jonline.module04.task10.entity.DaysOfWeek;
import my.home.jonline.module04.task10.entity.DepartureTime;
import my.home.jonline.module04.task10.search.AirlineSearch;
import my.home.jonline.module04.task10.view.View;

/*
 * 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы 
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и 
методами. Задать критерии выбора данных и вывести эти данные на консоль. 
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели. 
Найти и вывести: 
a) список рейсов для заданного пункта назначения; 
b) список рейсов для заданного дня недели; 
c) список рейсов для заданного дня недели, время вылета для которых больше заданного
 * 
 */

public class Main {

	public static void main(String[] args) {
		Airway airway = new Airway();
		View airlineViewer = new View();
		AirlineSearch airlineSearch = new AirlineSearch();

		airway.addAirline(new Airline("Moscow", "SU1147", "Airbus A319", new DepartureTime(18, 30),
				new DaysOfWeek[] { DaysOfWeek.MONDAY, DaysOfWeek.WEDNESDAY, DaysOfWeek.FRIDAY }));
		airway.addAirline(new Airline("Krasnodar", "SU1123", "Airbus A320", new DepartureTime(07, 10),
				new DaysOfWeek[] { DaysOfWeek.TUESDAY, DaysOfWeek.THURSDAY, DaysOfWeek.SATURDAY }));
		airway.addAirline(new Airline("Moscow", "SU1148", "Airbus A320", new DepartureTime(00, 20),
				new DaysOfWeek[] { DaysOfWeek.SUNDAY}));
		airway.addAirline(new Airline("Volgograd", "SU1134", "Airbus A321", new DepartureTime(15, 40),
				new DaysOfWeek[] { DaysOfWeek.MONDAY, DaysOfWeek.THURSDAY}));
		airway.addAirline(new Airline("Moscow", "SU1149", "Airbus A330", new DepartureTime(11, 25),
				new DaysOfWeek[] { DaysOfWeek.WEDNESDAY, DaysOfWeek.FRIDAY }));
	
		airlineViewer.viewAirlines(airway.getAirlines());
		
		
		List<Airline> mocsowFlights;
		mocsowFlights = airlineSearch.searchByDestination(airway.getAirlines(), "Moscow");
		airlineViewer.viewAirlines(mocsowFlights);
		
		
		List<Airline> mondayFlights;
		mondayFlights = airlineSearch.searchByDayOfWeek(airway.getAirlines(), DaysOfWeek.MONDAY);
		airlineViewer.viewAirlines(mondayFlights);
		
		
		List<Airline> mondayEveningFlights;
		mondayEveningFlights = airlineSearch.searchByDayAndTime(airway.getAirlines(), DaysOfWeek.MONDAY, new DepartureTime(17,00));
		airlineViewer.viewAirlines(mondayEveningFlights);
	}

}
