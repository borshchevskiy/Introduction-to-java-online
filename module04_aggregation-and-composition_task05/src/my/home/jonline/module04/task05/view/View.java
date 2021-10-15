package my.home.jonline.module04.task05.view;

import java.util.List;

import my.home.jonline.module04.task05.entity.Tour;

public class View {

	public void viewTour(Tour tour) {
		System.out.println(tour.getTourType() + " tour to " + tour.getTourDestination() + " on " + tour.getTourDays()
				+ " days, by " + tour.getTourTransport() + ", meals:  " + tour.getMeals() + ", price: "
				+ tour.getPrice());
	}

	public void viewTour(String message, Tour tour) {
		System.out.println(message);
		System.out.println(tour.getTourType() + " tour to " + tour.getTourDestination() + " on " + tour.getTourDays()
				+ " days, by " + tour.getTourTransport() + ", meals:  " + tour.getMeals() + ", price: "
				+ tour.getPrice());
	}

	public void viewTours(List<Tour> tours) {
		for (Tour tour : tours) {
			viewTour(tour);
		}
		System.out.println();
	}

	public void viewTours(String message, List<Tour> tours) {
		System.out.println(message);
		for (Tour tour : tours) {
			viewTour(tour);
		}
		System.out.println();
	}
}
