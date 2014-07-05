package com.treasurehunter.server.persistence.dao;

import com.google.appengine.api.datastore.Key;
import com.treasurehunter.server.persistence.model.City;

import java.util.List;

/**
 * @author Daniel Kocsis
 */
public class CityDAO extends BaseDAO<City> {

	public static CityDAO getInstance() {
		return _instance;
	}

	public City addCity(String name) {
		City city = new City();

		city.setName(name);

		return create(city);
	}

	@Override
	public List<City> findAll() {
		return findAll(City.class);
	}

	@Override
	public City getModelByKey(Key key) {
		return getModelByKey(City.class, key);
	}

	public City updateCity(Key key, String name) {
		City city =  getModelByKey(key);

		if (city == null) {
			return null;
		}

		city.setName(name);

		return update(city);
	}

	private CityDAO() {};

	private static CityDAO _instance = new CityDAO();

}
