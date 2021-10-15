package my.home.jonline.module04.task05.entity;

public class Tour implements Comparable<Tour> {

	private String tourType;
	private String tourDestination;
	private String tourTransport;
	private String meals;
	private int tourDays;
	private double price;

	public Tour() {

	}

	public Tour(String tourType, String tourDestination, String tourTransport, String meals, int tourDays,
			double price) {
		this.tourType = tourType;
		this.tourDestination = tourDestination;
		this.tourTransport = tourTransport;
		this.meals = meals;
		this.tourDays = tourDays;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTourType() {
		return tourType;
	}

	public void setTourType(String tourType) {
		this.tourType = tourType;
	}

	public String getTourDestination() {
		return tourDestination;
	}

	public void setTourDestination(String tourDestination) {
		this.tourDestination = tourDestination;
	}

	public String getTourTransport() {
		return tourTransport;
	}

	public void setTourTransport(String tourTransport) {
		this.tourTransport = tourTransport;
	}

	public String getMeals() {
		return meals;
	}

	public void setMeals(String meals) {
		this.meals = meals;
	}

	public int getTourDays() {
		return tourDays;
	}

	public void setTourDays(int tourDays) {
		this.tourDays = tourDays;
	}

	@Override
	public int compareTo(Tour anotherTour) {
		if (this.price > anotherTour.getPrice()) {
			return 1;
		} else if (anotherTour.getPrice() > this.price) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((meals == null) ? 0 : meals.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + tourDays;
		result = prime * result + ((tourDestination == null) ? 0 : tourDestination.hashCode());
		result = prime * result + ((tourTransport == null) ? 0 : tourTransport.hashCode());
		result = prime * result + ((tourType == null) ? 0 : tourType.hashCode());
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
		Tour other = (Tour) obj;
		if (meals == null) {
			if (other.meals != null)
				return false;
		} else if (!meals.equals(other.meals))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (tourDays != other.tourDays)
			return false;
		if (tourDestination == null) {
			if (other.tourDestination != null)
				return false;
		} else if (!tourDestination.equals(other.tourDestination))
			return false;
		if (tourTransport == null) {
			if (other.tourTransport != null)
				return false;
		} else if (!tourTransport.equals(other.tourTransport))
			return false;
		if (tourType == null) {
			if (other.tourType != null)
				return false;
		} else if (!tourType.equals(other.tourType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tour [tourType=" + tourType + ", tourDestination=" + tourDestination + ", tourTransport="
				+ tourTransport + ", meals=" + meals + ", tourDays=" + tourDays + ", price=" + price + "]";
	}

}
