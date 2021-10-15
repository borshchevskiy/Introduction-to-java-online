package my.home.jonline.module05.task03.entity;

public enum MonthOfYear {
	JANUARY("January", 31, 1), FEBRUARY("February", 28, 2), MARCH("March", 31, 3), APRIL("April", 30, 4),
	MAY("May", 31, 5), JUNE("June", 30, 6), JULY("July", 31, 7), AUGUST("August", 31, 8), SEPNEMBER("September", 30, 9),
	OCTOBER("October", 31, 10), NOVEMBER("November", 30, 11), DECEMBER("December", 31, 12);

	private String name;
	private int numberOfDays;
	private int number;

	private MonthOfYear(String name, int numberOfDays, int number) {
		this.name = name;
		this.numberOfDays = numberOfDays;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public int getNumber() {
		return number;
	}

}
