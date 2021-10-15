package my.home.jonline.module04.task03.entity;

import java.util.List;

public class Region extends TerritorialUnit{

	private String name;
	private int population;
	private double area;
	private List<District> districts;
	private City regionCentre;

	public Region() {

	}

	public Region(String name, List<District> districts) {
		this.name = name;
		this.districts = districts;

		for (District district : districts) {
			for (City city : district.getCities()) {
				if (city.isRegionCentre()) {
					regionCentre = city;
				}
			}

		}

		this.population = districts.stream().map(r -> r.getPopulation()).mapToInt(Integer::intValue).sum();
		this.area = districts.stream().map(r -> r.getArea()).mapToDouble(Double::doubleValue).sum();
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

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	public City getRegionCentre() {
		return regionCentre;
	}

	public void setRegionCentre(City regionCentre) {
		this.regionCentre = regionCentre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
		result = prime * result + ((regionCentre == null) ? 0 : regionCentre.hashCode());
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
		Region other = (Region) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		if (regionCentre == null) {
			if (other.regionCentre != null)
				return false;
		} else if (!regionCentre.equals(other.regionCentre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region [name=" + name + ", population=" + population + ", area=" + area + ", districts=" + districts
				+ ", regionCentre=" + regionCentre + "]";
	}

}
