package my.home.jonline.module04.task06.entity;

public class Time {

	private int hours;
	private int minutes;
	private int seconds;

	public Time() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}

	public Time(int hours, int minutes, int seconds) {
		if (hours < 0 || hours >= 24) {
			hours = 0;
		}

		this.hours = hours;

		if (minutes < 0 || minutes >= 60) {
			minutes = 0;
		}

		this.minutes = minutes;

		if (seconds < 0 || seconds >= 60) {
			seconds = 0;
		}

		this.seconds = seconds;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours < 0 || hours >= 24) {
			hours = 0;
		}

		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {

		if (minutes < 0 || minutes >= 60) {
			minutes = 0;
		}

		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {

		if (seconds < 0 || seconds >= 60) {
			seconds = 0;
		}

		this.seconds = seconds;
	}

	public String getTime() {
		String hoursString;
		String minutesString;
		String secondsString;
		String timeString;

		hoursString = String.valueOf(hours);
		minutesString = String.valueOf(minutes);
		secondsString = String.valueOf(seconds);

		if (hours / 10 == 0) {
			hoursString = "0" + hoursString;
		}

		if (minutes / 10 == 0) {
			minutesString = "0" + minutesString;
		}

		if (seconds / 10 == 0) {
			secondsString = "0" + secondsString;
		}

		timeString = hoursString + ":" + minutesString + ":" + secondsString;

		return timeString;
	}

	public void setTime(int hours, int minutes, int seconds) {

		if (hours < 0 || hours >= 24) {
			hours = 0;
		}

		this.hours = hours;

		if (minutes < 0 || minutes >= 60) {
			minutes = 0;
		}

		this.minutes = minutes;

		if (seconds < 0 || seconds >= 60) {
			seconds = 0;
		}

		this.seconds = seconds;
	}

	public void increaseTime(int addHours, int addMinutes, int addSeconds) {
		int additionalMinutes;
		int additionalHours;

		additionalMinutes = 0;
		additionalHours = 0;

		if (addSeconds < 0) {
			addSeconds = 0;
		}

		seconds += addSeconds;

		if (seconds >= 60) {
			while (seconds >= 60) {
				seconds -= 60;
				additionalMinutes++;
			}
		}

		if (addMinutes < 0) {
			addMinutes = 0;
		}
		
		minutes += addMinutes + additionalMinutes;
		
		if (minutes >= 60) {
			while (minutes >= 60) {
				minutes -= 60;
				additionalHours++;
			}
		}
		
		if (addHours < 0) {
			addHours = 0;
		}
		
		hours += addHours + additionalHours;
		
		if (hours > 23) {
			hours -= 24;
		}		
		
	}

	
	public void decreaseTime(int subtractHours, int subtractMinutes, int subtractSeconds) {
		int minusMinutes;
		int minusHours;

		minusMinutes = 0;
		minusHours = 0;

		if (subtractSeconds < 0) {
			subtractSeconds = 0;
		}

		seconds -= subtractSeconds;

		if (seconds < 0) {
			while (seconds < 0) {
				seconds += 60;
				minusMinutes++;
			}
		}

		if (subtractMinutes < 0) {
			subtractMinutes = 0;
		}
		
		minutes -= (subtractMinutes + minusMinutes);
		
		if (minutes < 0) {
			while (minutes < 0) {
				minutes += 60;
				minusHours++;
			}
		}
		
		if (subtractHours < 0) {
			subtractHours = 0;
		}
		
		hours -= (subtractHours + minusHours);
		
		if (hours < 0) {
			hours += 24;
		}
	}

	@Override
	public String toString() {
		return "Time [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hours;
		result = prime * result + minutes;
		result = prime * result + seconds;
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
		Time other = (Time) obj;
		if (hours != other.hours)
			return false;
		if (minutes != other.minutes)
			return false;
		if (seconds != other.seconds)
			return false;
		return true;
	}

	
	
}
