package my.home.jonline.module04.task05.comparator;

import java.util.Comparator;

import my.home.jonline.module04.task05.entity.Tour;

public class TourDaysComparator implements Comparator<Tour>{
	@Override
	public int compare(Tour firstTour, Tour secondTour) {
		return firstTour.getTourDays() - secondTour.getTourDays();
	}
}
