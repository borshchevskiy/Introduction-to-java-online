package my.home.jonline.module04.task04.entity;

import java.util.ArrayList;
import java.util.List;

public class TrainDepot {

	
	private List<Train> trainDepot;
	
	
	{
		trainDepot = new ArrayList<Train>();
	}

	
	public TrainDepot() {
		
	}
	
	
	public void addTrain(Train train) {
		trainDepot.add(train);
	}
	
	public void addTrains(List<Train> trains) {
		trainDepot.addAll(trains);
	}
	
	public Train getTrain(int index) {
		if (index < trainDepot.size()) {
			return trainDepot.get(index);
		}
		return null;
	}
	
	public List<Train> getTrains() {
		return trainDepot;
	}
	
	public void setTrain(Train train, int index) {
		if (index < trainDepot.size()) {
			trainDepot.set(index, train);
		}
	}
	
	public void setTrains(List<Train> trains) {
		trainDepot = trains;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trainDepot == null) ? 0 : trainDepot.hashCode());
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
		TrainDepot other = (TrainDepot) obj;
		if (trainDepot == null) {
			if (other.trainDepot != null)
				return false;
		} else if (!trainDepot.equals(other.trainDepot))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "TrainDepot [trainDepot=" + trainDepot + "]";
	}
	
	
	
}
