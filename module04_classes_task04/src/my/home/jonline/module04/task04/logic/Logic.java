package my.home.jonline.module04.task04.logic;

import java.util.Collections;
import java.util.List;

import my.home.jonline.module04.task04.entity.DepartureTime;
import my.home.jonline.module04.task04.entity.Train;

public class Logic {

	public void sortByNumber(List<Train> trains) {
		Collections.sort(trains);
	}

	public void sortByDestinationStation(List<Train> trains) {
		// first, sort by Destination station
		for (int j = 0; j < trains.size() - 1; j++) {
			for (int i = 0; i < trains.size() - 1; i++) {

				String firstStation = trains.get(i).getDestinationStation();
				String secondStation = trains.get(i + 1).getDestinationStation();

				if (firstStation.compareTo(secondStation) > 0) {
					Train tempTrain = trains.get(i);
					trains.set(i, trains.get(i + 1));
					trains.set(i + 1, tempTrain);
				}
			}
		}

		// sort trains with same Destination station by time

		for (int j = 0; j < trains.size() - 1; j++) {
			for (int i = 0; i < trains.size() - 1; i++) {

				String firstStation = trains.get(i).getDestinationStation();
				String secondStation = trains.get(i + 1).getDestinationStation();

				if (firstStation.equals(secondStation)) {
					
					DepartureTime firstTrainDepartureTime = trains.get(i).getDepartureTime();
					DepartureTime secondTrainDepartureTime = trains.get(i + 1).getDepartureTime();
					
					if (firstTrainDepartureTime.compareTo(secondTrainDepartureTime) > 0) {
						Train tempTrain = trains.get(i);
						trains.set(i, trains.get(i + 1));
						trains.set(i + 1, tempTrain);
					}
				}
			}
		}

	}

}
