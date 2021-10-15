package my.home.jonline.module04.task04.view;

import java.util.List;
import my.home.jonline.module04.task04.entity.Train;

public class View {

	public void showTrain(Train train) {
		System.out.println("Поезд №" + train.getNumber() + " до станции " + train.getDestinationStation() + " отправляется в " +train.getDepartureTimeString());
	}
	
	public void showTrains(List<Train> trains) {
		for (Train train : trains) {
			showTrain(train);
		}
		System.out.println();
	}
	
	public void showMessage(String message) {
		System.out.println(message);
	}
}
