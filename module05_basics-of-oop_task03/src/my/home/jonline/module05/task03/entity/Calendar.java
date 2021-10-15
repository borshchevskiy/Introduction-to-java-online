package my.home.jonline.module05.task03.entity;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
	private int yearNumber;
	private List<Month> months;
	private boolean isLeapYear;
	private final int LeapFebruaryDays = 29;
	private DayOfWeek firstDayOfYear;

	public Calendar(int number) {
		this.yearNumber = number;
		this.isLeapYear = checkLeapYear(yearNumber);
		this.firstDayOfYear = DayOfWeek.values()[findFirstDayOfTheYear(yearNumber)];
		this.months = setMonthsList();
	}

	private List<Month> setMonthsList() {
		List<Month> months = new ArrayList<>();

		for (MonthOfYear monthOfYear : MonthOfYear.values()) {
			months.add(new Month(monthOfYear));
		}

		return months;
	}

	private boolean checkLeapYear(int yearNumber) {
		if (yearNumber % 400 == 0) {
			return true;
		}
		if ((yearNumber % 100 != 0) & (yearNumber % 4 == 0)) {
			return true;
		}

		return false;
	}

	private int findFirstDayOfTheYear(int yearNumber) {
		int year;
		year = (yearNumber - 1) % 400;
		int century = year / 100;
		int index = ((4 * century) + (year % 100)) % 28;
		int weekday = (index + (index / 4));

		return (weekday % 7);
	}

	public int getYearNumber() {
		return yearNumber;
	}

	public void setYearNumber(int yearNumber) {
		this.yearNumber = yearNumber;
	}

	public List<Month> getMonths() {
		return months;
	}

	public void setMonths(List<Month> months) {
		this.months = months;
	}

	public boolean isLeapYear() {
		return isLeapYear;
	}

	public void setLeapYear(boolean isLeapYear) {
		this.isLeapYear = isLeapYear;
	}

	public DayOfWeek getFirstDayOfYear() {
		return firstDayOfYear;
	}

	public void setFirstDayOfYear(DayOfWeek firstDayOfYear) {
		this.firstDayOfYear = firstDayOfYear;
	}

	public int getLeapFebruaryDays() {
		return LeapFebruaryDays;
	}

	public class Month {
		private MonthOfYear month;
		private String monthName;
		private int monthNumber;
		private int numberOfDays;
		private List<Day> days;

		public Month() {

		}

		public Month(MonthOfYear month) {
			this.month = month;
			this.monthName = month.getName();
			this.monthNumber = month.getNumber();
			this.numberOfDays = month.getNumberOfDays();

			if (month == MonthOfYear.FEBRUARY && isLeapYear) {
				this.numberOfDays = 29;
			}

			this.days = setDaysList(monthNumber, numberOfDays);

		}

		private List<Day> setDaysList(int monthNumber, int numberOfDays) {
			int shifts[] = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
			List<Day> days = new ArrayList<>();
			int shift = shifts[monthNumber - 1];
			if (isLeapYear && (monthNumber > 2)) {
				shift++;
			}

			int day = (firstDayOfYear.getNumber() + shift) % 7;

			int index = day == 0 ? 6 : day - 1;

			for (int i = 1; i <= numberOfDays; i++) {
				if (index > 6) {
					index = 0;
				}
				days.add(new Day(DayOfWeek.values()[index++], i));
			}
			return days;
		}

		public String getMonthName() {
			return monthName;
		}

		public void setMonthName(String monthName) {
			this.monthName = monthName;
		}

		public int getMonthNumber() {
			return monthNumber;
		}

		public void setMonthNumber(int monthNumber) {
			this.monthNumber = monthNumber;
		}

		public MonthOfYear getMonth() {
			return month;
		}

		public void setMonth(MonthOfYear month) {
			this.month = month;
		}

		public int getNumberOfDays() {
			return numberOfDays;
		}

		public void setNumberOfDays(int numberOfDays) {
			this.numberOfDays = numberOfDays;
		}

		public List<Day> getDays() {
			return days;
		}

		public void setDays(List<Day> days) {
			this.days = days;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((days == null) ? 0 : days.hashCode());
			result = prime * result + ((month == null) ? 0 : month.hashCode());
			result = prime * result + ((monthName == null) ? 0 : monthName.hashCode());
			result = prime * result + monthNumber;
			result = prime * result + numberOfDays;
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
			Month other = (Month) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (days == null) {
				if (other.days != null)
					return false;
			} else if (!days.equals(other.days))
				return false;
			if (month != other.month)
				return false;
			if (monthName == null) {
				if (other.monthName != null)
					return false;
			} else if (!monthName.equals(other.monthName))
				return false;
			if (monthNumber != other.monthNumber)
				return false;
			if (numberOfDays != other.numberOfDays)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Month [month=" + month + ", monthName=" + monthName + ", monthNumber=" + monthNumber
					+ ", numberOfDays=" + numberOfDays + ", days=" + days + "]";
		}

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}

	}

	public class Day {
		private DayOfWeek day;
		private String dayName;
		private int dateOfMonth;
		private boolean isWeekend;
		private boolean isHoliday;

		public Day() {

		}

		public Day(DayOfWeek day, int dateOfMonth) {
			this.day = day;
			this.dayName = day.getName();
			this.dateOfMonth = dateOfMonth;
			this.isWeekend = setWeekend(day);
			this.isHoliday = false;
		}

		private boolean setWeekend(DayOfWeek day) {
			switch (day) {
			case SUNDAY:
			case SATURDAY:
				return true;
			default:
				return false;
			}
		}

		public DayOfWeek getDay() {
			return day;
		}

		public void setDay(DayOfWeek day) {
			this.day = day;
		}

		public String getDayName() {
			return dayName;
		}

		public void setDayName(String dayName) {
			this.dayName = dayName;
		}

		public int getDateOfMonth() {
			return dateOfMonth;
		}

		public void setDateOfMonth(int dateOfMonth) {
			this.dateOfMonth = dateOfMonth;
		}

		public boolean isWeekend() {
			return isWeekend;
		}

		public void setWeekend(boolean isWeekend) {
			this.isWeekend = isWeekend;
		}

		public boolean isHoliday() {
			return isHoliday;
		}

		public void setHoliday(boolean isHoliday) {
			this.isHoliday = isHoliday;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + dateOfMonth;
			result = prime * result + ((day == null) ? 0 : day.hashCode());
			result = prime * result + ((dayName == null) ? 0 : dayName.hashCode());
			result = prime * result + (isHoliday ? 1231 : 1237);
			result = prime * result + (isWeekend ? 1231 : 1237);
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
			Day other = (Day) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (dateOfMonth != other.dateOfMonth)
				return false;
			if (day != other.day)
				return false;
			if (dayName == null) {
				if (other.dayName != null)
					return false;
			} else if (!dayName.equals(other.dayName))
				return false;
			if (isHoliday != other.isHoliday)
				return false;
			if (isWeekend != other.isWeekend)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Day [day=" + day + ", dayName=" + dayName + ", dateOfMonth=" + dateOfMonth + ", isWeekend="
					+ isWeekend + ", isHoliday=" + isHoliday + "]";
		}

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + LeapFebruaryDays;
		result = prime * result + ((firstDayOfYear == null) ? 0 : firstDayOfYear.hashCode());
		result = prime * result + (isLeapYear ? 1231 : 1237);
		result = prime * result + ((months == null) ? 0 : months.hashCode());
		result = prime * result + yearNumber;
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
		Calendar other = (Calendar) obj;
		if (LeapFebruaryDays != other.LeapFebruaryDays)
			return false;
		if (firstDayOfYear != other.firstDayOfYear)
			return false;
		if (isLeapYear != other.isLeapYear)
			return false;
		if (months == null) {
			if (other.months != null)
				return false;
		} else if (!months.equals(other.months))
			return false;
		if (yearNumber != other.yearNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Calendar [yearNumber=" + yearNumber + ", months=" + months + ", isLeapYear=" + isLeapYear
				+ ", LeapFebruaryDays=" + LeapFebruaryDays + ", firstDayOfYear=" + firstDayOfYear + "]";
	}

}
