package my.home.jonline.module04.task04.main;

import my.home.jonline.module04.task04.entity.*;
import my.home.jonline.module04.task04.input.UserInput;
import my.home.jonline.module04.task04.logic.Logic;
import my.home.jonline.module04.task04.view.View;

/* Простейшие классы и объекты.
 * 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по 
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами 
назначения должны быть упорядочены по времени отправления.
 */

public class Main {

	public static void main(String[] args) {
		
		TrainDepot depot = new TrainDepot();
		Logic logic = new Logic();
		View view = new View();
		UserInput userInput = new UserInput();
		
		
		depot.addTrain(new Train("Тихорецкая", 63, new DepartureTime(6,45)));
		depot.addTrain(new Train("Грязи", 54, new DepartureTime(8,31)));
		depot.addTrain(new Train("Тихорецкая", 31, new DepartureTime(6,44)));
		depot.addTrain(new Train("Грязи", 12, new DepartureTime(2,25)));
		depot.addTrain(new Train("Тихорецкая", 1, new DepartureTime(6,26)));

		
		view.showTrains(depot.getTrains());
		
		logic.sortByNumber(depot.getTrains());
		
		view.showTrains(depot.getTrains());
		
		logic.sortByDestinationStation(depot.getTrains());
		
		view.showTrains(depot.getTrains());
		
		userInput.inputTrainNumber(depot.getTrains());
	}

}
