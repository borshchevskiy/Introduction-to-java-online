package my.home.jonline.module05.task03.action;

import my.home.jonline.module05.task03.entity.Calendar;

public class CalendarAction {

	public void setWeekend(Calendar calendar, int monthNumber, int dayNumber, boolean isWeekend) {
		calendar.getMonths().get(monthNumber - 1).getDays().get(dayNumber - 1).setWeekend(isWeekend);
	}

	public void setHoliday(Calendar calendar, int monthNumber, int dayNumber, boolean isHoliday) {
		calendar.getMonths().get(monthNumber - 1).getDays().get(dayNumber - 1).setHoliday(isHoliday);
	}

}
