package my.home.jonline.module04.task04.entity;

public class DepartureTime implements Comparable<DepartureTime>{

	private int hours;
	private int minutes;
	private boolean isTimeSet;
	
	
	public DepartureTime() {
		this.isTimeSet = false;
	}
	
	
	public DepartureTime(int hours, int minutes) {
		
		this.isTimeSet = true;
		
		if (hours >= 0 && hours <= 23) {
			this.hours = hours;
		} else {
			this.hours = 0;
			isTimeSet = false;
		}
		
		if (minutes >= 0 && minutes <= 59) {
			this.minutes = minutes;
		} else {
			this.minutes = 0;
			isTimeSet = false;
		}
		
	}


	public int getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	public String getTime() {
		
		if (!isTimeSet) {
			return "--:--";
		}
		
		String hourString;
		String minuteString;
		
		hourString = String.valueOf(hours);
		minuteString = String.valueOf(minutes);
				
		
		if (hours / 10 == 0) {
			hourString = "0" + hours;
		}
		
		if (minutes / 10 == 0) {
			minuteString = "0" + minutes;
		}
		
		return hourString + ":" + minuteString;
	}


	@Override
	public int compareTo(DepartureTime departureTime) {
		if (this.getHours() > departureTime.getHours()) {
			return 1;
		}
		
		if (this.getHours() < departureTime.getHours()) {
			return -1;
		}
		
		if (this.getHours() == departureTime.getHours()) {
			if (this.getMinutes() > departureTime.getMinutes()) {
				return 1;
			}
			if (this.getMinutes() < departureTime.getMinutes()) {
				return -1;
			}
		}
		return 0;
	}
	
	
	
	
}
