package my.home.jonline.module04.task03.logic;

import java.util.ArrayList;
import java.util.List;

import my.home.jonline.module04.task03.entity.City;
import my.home.jonline.module04.task03.entity.District;
import my.home.jonline.module04.task03.entity.Region;
import my.home.jonline.module04.task03.entity.State;


public class Logic {

	private static City CityNotFound = new City("Not found", 0, 0, false, false, false);

	public City getCapital(State state) {
		List<City> cities;
		
		cities = getAllCities(state);

		for (City city : cities) {
			if (city.isCapital()) {
				return city;				
			}
		}
		return CityNotFound;
	}

	public int getNumberOfRegions(State state) {
		return state.getRegions().size();
	}

	public List<City> getDistrictCentres(State state) {
		List<City> cities;
		List<City> districtCentres;
		
		cities = getAllCities(state);
		districtCentres = new ArrayList<>();		
		
		for (City city : cities) {
			if (city.isRegionCentre()) {
				districtCentres.add(city);
			}
		}
		return districtCentres;
	}

	public List<District> getAllDistricts(State state) {
		List<District> districts;
		districts = new ArrayList<>();

		for (Region region : state.getRegions()) {
			districts.addAll(region.getDistricts());
		}

		return districts;
	}

	public List<City> getAllCities(State state) {
		List<City> cities;
		cities = new ArrayList<>();

		List<District> districts = getAllDistricts(state);

		for (District district : districts) {
			cities.addAll(district.getCities());
		}

		return cities;
	}
}
