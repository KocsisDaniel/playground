package com.treasurehunter.server.persistence.dao;

import com.google.appengine.api.datastore.Key;
import com.treasurehunter.server.persistence.model.Location;

import java.util.List;

/**
 * @author Levente Hudák
 */
public class LocationDAO extends BaseDAO<Location> {

	/**
	 * Gets the LocationDAO instance
	 * @return The LocationDAO instance
	 */
	public static LocationDAO getInstance() {
		return _instance;
	}

	/**
	 * Creates a new location
	 * @param name Name of the location
	 * @param description Description of the location
	 * @param latitude Latitude of the location
	 * @param longitude Longitude of the location
	 * @param altitude Altitude of the location
	 * @return The created location
	 */
	public Location addLocation(
		String name, String description, double latitude, double longitude,
		double altitude) {

		Location location = new Location();

		location.setAltitude(altitude);
		location.setDescription(description);
		location.setLatitude(latitude);
		location.setLongitude(longitude);
		location.setName(name);

		return create(location);
	}

	/**
	 * Gets all locations
	 * @return All locations
	 */
	@Override
	public List<Location> findAll() {
		return findAll(Location.class);
	}

	/**
	 * Gets the location associated with the given key
	 * @param key Key of the location
	 * @return The location
	 */
	@Override
	public Location getModelByKey(Key key) {
		return getModelByKey(Location.class, key);
	}

	/**
	 * Updates the location with the given key
	 * @param key Key of the location
	 * @param name Nme of the location
	 * @param description Description of the location
	 * @param latitude Latitude of the location
	 * @param longitude Longitude of the location
	 * @param altitude Altitude of the location
	 * @return The updated location
	 */
	public Location updateLocation(
		Key key, String name, String description, double latitude,
		double longitude, double altitude) {

		Location location = getModelByKey(key);

		if (location == null) {
			return null;
		}

		location.setAltitude(altitude);
		location.setDescription(description);
		location.setLatitude(latitude);
		location.setLongitude(longitude);
		location.setName(name);

		return update(location);
	}

	private LocationDAO() {};

	private static LocationDAO _instance = new LocationDAO();

}
