package my.home.jonline.module04.task10.entity;

public enum DaysOfWeek {
	MONDAY("Monday"), 
	TUESDAY("Tuesday"), 
	WEDNESDAY("Wednesday"), 
	THURSDAY("Thursday"), 
	FRIDAY("Friday"), 
	SATURDAY("Saturday"), 
	SUNDAY("Sunday");

	private String text;
	
	private DaysOfWeek(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
}
