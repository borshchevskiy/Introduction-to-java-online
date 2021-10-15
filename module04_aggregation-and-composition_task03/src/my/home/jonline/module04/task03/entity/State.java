package my.home.jonline.module04.task03.entity;

import java.util.ArrayList;
import java.util.List;

public class State extends TerritorialUnit{
	private String name;
	private int population;
	private double area;
	private List<Region> regions;

	public State() {

	}

	public State(String name) {
		this.name = name;

		regions = new ArrayList<>();
		
		City bigCity = new City("Big City", 1000, 100, false, true, true);
		City smallCity = new City("Small City", 100, 50, false, true, false);
		City veryBigCity = new City("Very Big City", 5000, 500, true, true, true);
		City verySmallCity = new City("Very Small City", 50, 10, false, true, false);
		
		List<City> northernDistrictCities = new ArrayList<>();
		northernDistrictCities.add(bigCity);
		
		List<City> southernDistrictCities = new ArrayList<>();
		southernDistrictCities.add(smallCity);
		
		List<City> easternDistrictCities = new ArrayList<>();
		easternDistrictCities.add(veryBigCity);
		
		List<City> westernDistrictCities = new ArrayList<>();
		westernDistrictCities.add(verySmallCity);
		
		District northernDistrict = new District("Northern District", 2000, 200, northernDistrictCities);
		District southernDistrict = new District("Southern District", 200, 100, southernDistrictCities);
		District easternDistrict = new District("Eastern District", 10000, 1000, easternDistrictCities);
		District westernDistrict = new District("Western District", 100, 20, westernDistrictCities);
		
		List<District> firstRegionDistricts = new ArrayList<>();
		firstRegionDistricts.add(northernDistrict);
		firstRegionDistricts.add(southernDistrict);
		
		List<District> secondRegionDistricts = new ArrayList<>();
		secondRegionDistricts.add(easternDistrict);
		secondRegionDistricts.add(westernDistrict);
		
		
		Region firstRegion = new Region("First region", firstRegionDistricts);
		Region secondRegion = new Region("Second region", secondRegionDistricts);
		
		regions.add(firstRegion);
		regions.add(secondRegion);

		this.population = regions.stream().map(r -> r.getPopulation()).mapToInt(Integer::intValue).sum();
		this.area = regions.stream().map(r -> r.getArea()).mapToDouble(Double::doubleValue).sum();

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

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
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
		State other = (State) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", population=" + population + ", area=" + area + ", regions=" + regions + "]";
	}

}
