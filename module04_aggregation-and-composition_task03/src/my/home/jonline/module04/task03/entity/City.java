package my.home.jonline.module04.task03.entity;

public class City extends TerritorialUnit{
	
	private String name;
	private int population;
	private double area;
	private boolean isCapital;
	private boolean isDistrictCentre;
	private boolean isRegionCentre;
	
	
	public City() {
		
	}


	public City(String name, int population, double area, boolean isCapital, boolean isDistrictCentre,
			boolean isRegionCentre) {
		this.name = name;
		this.population = population;
		this.area = area;
		this.isCapital = isCapital;
		this.isDistrictCentre = isDistrictCentre;
		this.isRegionCentre = isRegionCentre;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPopulation() {
		return population;
	}


	public void setPopulation(int population) {
		this.population = population;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public boolean isCapital() {
		return isCapital;
	}


	public void setCapital(boolean isCapital) {
		this.isCapital = isCapital;
	}


	public boolean isDistrictCentre() {
		return isDistrictCentre;
	}


	public void setDistrictCentre(boolean isDistrictCentre) {
		this.isDistrictCentre = isDistrictCentre;
	}


	public boolean isRegionCentre() {
		return isRegionCentre;
	}


	public void setRegionCentre(boolean isRegionCentre) {
		this.isRegionCentre = isRegionCentre;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isCapital ? 1231 : 1237);
		result = prime * result + (isDistrictCentre ? 1231 : 1237);
		result = prime * result + (isRegionCentre ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
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
		City other = (City) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (isCapital != other.isCapital)
			return false;
		if (isDistrictCentre != other.isDistrictCentre)
			return false;
		if (isRegionCentre != other.isRegionCentre)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "City [name=" + name + ", population=" + population + ", area=" + area + ", isCapital=" + isCapital
				+ ", isDistrictCentre=" + isDistrictCentre + ", isRegionCentre=" + isRegionCentre + "]";
	}

	
	
}
