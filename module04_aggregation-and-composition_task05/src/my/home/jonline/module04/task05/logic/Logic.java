package my.home.jonline.module04.task05.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import my.home.jonline.module04.task05.comparator.TourDaysComparator;
import my.home.jonline.module04.task05.comparator.TourDestinationComparator;
import my.home.jonline.module04.task05.comparator.TourMealsComparator;
import my.home.jonline.module04.task05.comparator.TourTransportComparator;
import my.home.jonline.module04.task05.comparator.TourTypeComparator;
import my.home.jonline.module04.task05.entity.Tour;

public class Logic {

	public List<Tour> findToursByType(List<Tour> tours, String type) {
		List<Tour> toursByType;

		toursByType = new ArrayList<>();

		for (Tour tour : tours) {
			if (tour.getTourType().equals(type)) {
				toursByType.add(tour);
			}
		}

		return toursByType;
	}

	public List<Tour> findToursByDestination(List<Tour> tours, String destination) {
		List<Tour> toursByDestination;

		toursByDestination = new ArrayList<>();

		for (Tour tour : tours) {
			if (tour.getTourDestination().equals(destination)) {
				toursByDestination.add(tour);
			}
		}

		return toursByDestination;
	}

	public List<Tour> findToursByTransport(List<Tour> tours, String transport) {
		List<Tour> toursByTransport;

		toursByTransport = new ArrayList<>();

		for (Tour tour : tours) {
			if (tour.getTourTransport().equals(transport)) {
				toursByTransport.add(tour);
			}
		}

		return toursByTransport;
	}

	public List<Tour> findToursByMeals(List<Tour> tours, String meal) {
		List<Tour> toursByMeals;

		toursByMeals = new ArrayList<>();

		for (Tour tour : tours) {
			if (tour.getMeals().equals(meal)) {
				toursByMeals.add(tour);
			}
		}

		return toursByMeals;
	}

	public List<Tour> findToursByDays(List<Tour> tours, int days) {
		List<Tour> toursByDays;

		toursByDays = new ArrayList<>();

		for (Tour tour : tours) {
			if (tour.getTourDays() == days) {
				toursByDays.add(tour);
			}
		}
		return toursByDays;
	}

	public void sortByType(List<Tour> tours) {
		Comparator<Tour> comparator = new TourTypeComparator();
		Collections.sort(tours, comparator);
	}

	public void sortByDestination(List<Tour> tours) {
		Comparator<Tour> comparator = new TourDestinationComparator();
		Collections.sort(tours, comparator);
	}

	public void sortByTransport(List<Tour> tours) {
		Comparator<Tour> comparator = new TourTransportComparator();
		Collections.sort(tours, comparator);
	}

	public void sortByMeals(List<Tour> tours) {
		Comparator<Tour> comparator = new TourMealsComparator();
		Collections.sort(tours, comparator);
	}

	public void sortByDays(List<Tour> tours) {
		Comparator<Tour> comparator = new TourDaysComparator();
		Collections.sort(tours, comparator);
	}

	public void sortByPrice(List<Tour> tours) {
		Collections.sort(tours);
	}

}
