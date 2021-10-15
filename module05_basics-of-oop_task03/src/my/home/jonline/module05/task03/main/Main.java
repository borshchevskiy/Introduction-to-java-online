package my.home.jonline.module05.task03.main;

import my.home.jonline.module05.task03.action.CalendarAction;
import my.home.jonline.module05.task03.entity.Calendar;
import my.home.jonline.module05.task03.view.CalendarView;

public class Main {

	public static void main(String[] args) {
		Calendar calendar;
		CalendarAction calendarAction;
		CalendarView calendarView;

		calendar = new Calendar(2021);
		calendarAction = new CalendarAction();
		calendarView = new CalendarView();
		
		calendarAction.setHoliday(calendar, 1, 1, true);
		calendarAction.setHoliday(calendar, 5, 9, true);
		
		calendarView.printHolidays(calendar);
		
		calendarView.printWeekends(calendar);

	}

}
