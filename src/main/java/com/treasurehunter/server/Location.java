package com.treasurehunter.server;

public class Location {

	public String getDescription() {
		return _description;
	}

	public String getName() {
		return _name;
	}

	public float getLatitude() {
		return _latitude;
	}

	public float getLongitude() {
		return _longitude;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public void setName(String name) {
		_name = name;
	}

	public void setLatitude(float latitude) {
		_latitude = latitude;
	}

	public void setLongitude(float longitude) {
		_longitude = longitude;
	}

	private float _latitude = 0;
	private float _longitude = 0;
	private String _name = "";
	private String _description = "";

}
