package my.home.jonline.module04.task05.entity;

import java.util.ArrayList;
import java.util.List;

public class TourPackage {

	List<Tour> tours = new ArrayList<>();

	public TourPackage() {
		tours = new ArrayList<>();
	}

	public TourPackage(List<Tour> tours) {
		this.tours = tours;
	}
	
	public void addTour(Tour tour) {
		tours.add(tour);
	}
	
	public void removeTour(Tour tour) {
		tours.remove(tour);
	}

	public List<Tour> getTours() {
		return tours;
	}

	public void setTours(List<Tour> tours) {
		this.tours = tours;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tours == null) ? 0 : tours.hashCode());
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
		TourPackage other = (TourPackage) obj;
		if (tours == null) {
			if (other.tours != null)
				return false;
		} else if (!tours.equals(other.tours))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TourPackage [tours=" + tours + "]";
	}
	
	
}
