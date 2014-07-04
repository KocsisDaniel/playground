package com.treasurehunter.server.persistence.model;

public class Location {

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

	public long getLocationId() {
		return _locationId;
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

	public void setLocationId(long locationId) {
		_locationId = locationId;
	}

	public void setLongitude(double longitude) {
		_longitude = longitude;
	}

	private double _altitude = 0;
	private String _description = "";
	private double _latitude = 0;
	private long _locationId = 0;
	private double _longitude = 0;
	private String _name = "";

}
