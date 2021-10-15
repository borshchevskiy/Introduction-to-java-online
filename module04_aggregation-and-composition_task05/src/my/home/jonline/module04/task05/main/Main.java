package my.home.jonline.module04.task05.main;

import java.util.ArrayList;
import java.util.List;

import my.home.jonline.module04.task05.entity.Tour;
import my.home.jonline.module04.task05.entity.TourPackage;
import my.home.jonline.module04.task05.logic.Logic;
import my.home.jonline.module04.task05.view.View;

/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать 
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class Main {

	public static void main(String[] args) {
		Tour shoppingTour;
		Tour rehabTour;
		Tour sightSeeingTour;
		Tour relaxTour;
		Tour cruiseTour;

		shoppingTour = new Tour("Shopping", "Milan", "plane", "OB", 5, 1500);
		rehabTour = new Tour("Rehabilitation", "Karlovy Vary", "plane", "FB", 10, 2500);
		sightSeeingTour = new Tour("Sightseeing", "Paris", "train", "HB+", 8, 4000);
		relaxTour = new Tour("Relax", "Alicante", "plane", "HB", 7, 3500);
		cruiseTour = new Tour("Cruise", "Athens", "ship", "FB", 10, 7500);

		List<Tour> tours;

		tours = new ArrayList<>();

		tours.add(shoppingTour);
		tours.add(rehabTour);
		tours.add(sightSeeingTour);
		tours.add(relaxTour);
		tours.add(cruiseTour);

		TourPackage availableTours;
		availableTours = new TourPackage(tours);

		Logic logic = new Logic();
		View view = new View();

		List<Tour> planeTours;
		planeTours = logic.findToursByTransport(availableTours.getTours(), "plane");
		view.viewTours("Tours by plane:", planeTours);

		List<Tour> fullBoardTours;
		fullBoardTours = logic.findToursByMeals(availableTours.getTours(), "FB");
		view.viewTours("Tours with full board meals:", fullBoardTours);

		List<Tour> tenDayTours;
		tenDayTours = logic.findToursByDays(availableTours.getTours(), 10);
		view.viewTours("Tours with 10 days length:", tenDayTours);

		logic.sortByDays(availableTours.getTours());
		view.viewTours("Tours sorted by length:", availableTours.getTours());

		logic.sortByPrice(availableTours.getTours());
		view.viewTours("Tours sorted by price:", availableTours.getTours());
	}

}
