package com.treasurehunter.server.persistence.dao;

import com.google.appengine.api.datastore.Key;
import com.treasurehunter.server.persistence.model.Location;
import com.treasurehunter.server.persistence.model.Treasure;

import java.util.List;

/**
 * @author Levente Hudák
 */
public class TreasureDAO extends BaseDAO<Treasure> {

	/**
	 * Gets the TreasureDAO instance
	 * @return The LocationDAO instance
	 */
	public static TreasureDAO getInstance() {
		return _instance;
	}

	/**
	 * Creates a new treasure
	 * @param name Name of the treasure
	 * @param description Description of the treasure
	 * @param location Location of the treasure
	 * @param weight Weight of the treasure
	 * @return The created treasure
	 */
	public Treasure addTreasure(
		String name, String description, Location location, int weight) {

		Treasure treasure = new Treasure();

		treasure.setDescription(description);
		treasure.setLocation(location);
		treasure.setName(name);
		treasure.setWeight(weight);

		return create(treasure);
	}

	/**
	 * Finds all treasures
	 * @return All treasures
	 */
	@Override
	public List<Treasure> findAll() {
		return findAll(Treasure.class);
	}

	/**
	 * Gets the treasure associated with the given key
	 * @param key Key of the treasure
	 * @return The treasure
	 */
	@Override
	public Treasure getModelByKey(Key key) {
		return getModelByKey(Treasure.class, key);
	}

	/**
	 * Updates the treasure with the given key
	 * @param key Key of the treasure
	 * @param name Name of the treasure
	 * @param description Description of the treasure
	 * @param location Location of the treasure
	 * @param weight Weight of the treasure
	 * @return The updated treasure
	 */
	public Treasure updateTreasure(
		Key key, String name, String description, Location location,
		int weight) {

		Treasure treasure = getModelByKey(key);

		if (treasure == null) {
			return null;
		}

		treasure.setDescription(description);
		treasure.setLocation(location);
		treasure.setName(name);
		treasure.setWeight(weight);

		return update(treasure);
	}

	private TreasureDAO() {};

	private static TreasureDAO _instance = new TreasureDAO();
}
