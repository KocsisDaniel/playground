package com.treasurehunter.server.persistence.model;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class Location extends DataStoreModel {

	public double getAltitude() {
		return _altitude;
	}

	public String getDescription() {
		return _description;
	}

	public String getName() {
		return _name;
	}

	public double getLatitude() {
		return _latitude;
	}

	public double getLongitude() {
		return _longitude;
	}

	public void setAltitude(double altitude) {
		_altitude = altitude;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public void setName(String name) {
		_name = name;
	}

	public void setLatitude(double latitude) {
		_latitude = latitude;
	}

	public void setLongitude(double longitude) {
		_longitude = longitude;
	}

	@Persistent
	private double _altitude;
	@Persistent
	private String _description;
	@Persistent
	private double _latitude;
	@Persistent
	private double _longitude;
	@Persistent
	private String _name;

}
