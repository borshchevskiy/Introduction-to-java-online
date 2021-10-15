package my.home.jonline.module04.task04.entity;

public class Train implements Comparable<Train> {

	private String destinationStation;
	private int number;
	private DepartureTime departureTime;

	public Train() {
	}

	public Train(String destinationStation, int number, DepartureTime departureTime) {
		this.destinationStation = destinationStation;
		this.number = number;
		this.departureTime = departureTime;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public DepartureTime getDepartureTime() {
		return departureTime;
	}
	
	public String getDepartureTimeString() {
		return departureTime.getTime();
	}
		

	public void setDepartureTime(DepartureTime departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public String toString() {
		return "Train [destinationStation=" + destinationStation + ", number=" + number + ", departureTime="
				+ departureTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destinationStation == null) ? 0 : destinationStation.hashCode());
		result = prime * result + number;
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
		Train other = (Train) obj;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destinationStation == null) {
			if (other.destinationStation != null)
				return false;
		} else if (!destinationStation.equals(other.destinationStation))
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public int compareTo(Train train) {
		if (this.getNumber() > train.getNumber()) {
			return 1;
		}

		if (this.getNumber() < train.getNumber()) {
			return -1;
		}
		return 0;
	}

}
