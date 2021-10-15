package my.home.jonline.module04.task03.entity;

import java.util.List;

public class District extends TerritorialUnit{
	
	private String name;
	private int population;
	private double area;
	private List<City> cities;
	private City dictrictCentre;
	
	
	public District() {
		
	}


	public District(String name, int population, double area, List<City> cities) {
		this.name = name;
		this.population = population;
		this.area = area;
		this.cities = cities;
		for (City city : cities) {
			if (city.isDistrictCentre()) {
				dictrictCentre = city;
			}
		}
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


	public List<City> getCities() {
		return cities;
	}


	public void setCities(List<City> cities) {
		this.cities = cities;
	}


	public City getDictrictCentre() {
		return dictrictCentre;
	}


	public void setDictrictCentre(City dictrictCentre) {
		this.dictrictCentre = dictrictCentre;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
		result = prime * result + ((dictrictCentre == null) ? 0 : dictrictCentre.hashCode());
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
		District other = (District) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (cities == null) {
			if (other.cities != null)
				return false;
		} else if (!cities.equals(other.cities))
			return false;
		if (dictrictCentre == null) {
			if (other.dictrictCentre != null)
				return false;
		} else if (!dictrictCentre.equals(other.dictrictCentre))
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
		return "District [name=" + name + ", population=" + population + ", area=" + area + ", cities=" + cities
				+ ", dictrictCentre=" + dictrictCentre + "]";
	}
	
	
}
