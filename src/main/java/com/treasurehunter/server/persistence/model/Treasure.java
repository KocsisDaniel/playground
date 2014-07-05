package com.treasurehunter.server.persistence.model;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable(detachable="true")
public class Treasure extends DataStoreModel {

	public String getDescription() {
		return _description;
	}

	public Location getLocation() {
		return _location;
	}

	public String getName() {
		return _name;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public void setLocation(Location location) {
		_location = location;
	}

	public void setName(String name) {
		_name = name;
	}

	@Persistent
	private String _description;
	@Persistent(dependent = "true")
	private Location _location;
	@Persistent
	private String _name;

}
