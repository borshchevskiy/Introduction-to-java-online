package my.home.jonline.module05.task03.view;

import my.home.jonline.module05.task03.entity.Calendar;

public class CalendarView {

	public void printCalendar(Calendar calendar) {
		System.out.println(calendar.getYearNumber());

		for (Calendar.Month month : calendar.getMonths()) {
			System.out.println();
			System.out.println(month.getMonthName());
			System.out.println();
			for (Calendar.Day day : month.getDays()) {
				System.out.println(day.getDateOfMonth() + " " + day.getDayName());
			}
		}
	}

	public void printWeekends(Calendar calendar) {
		System.out.println("Weekends:");
		for (Calendar.Month month : calendar.getMonths()) {
			for (Calendar.Day day : month.getDays()) {
				if (day.isWeekend()) {
					System.out.println(month.getMonthName() + ", " + day.getDateOfMonth() + " " + day.getDayName());
				}
			}
		}
	}

	public void printHolidays(Calendar calendar) {
		System.out.println("Holidays:");
		for (Calendar.Month month : calendar.getMonths()) {
			for (Calendar.Day day : month.getDays()) {
				if (day.isHoliday()) {
					System.out.println(month.getMonthName() + ", " + day.getDateOfMonth() + " " + day.getDayName());
				}
			}
		}
	}
}
