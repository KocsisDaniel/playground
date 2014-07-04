package com.treasurehunter.server.persistence.model;

public class Treasure {

	public long getCategoryId() {
		return _categoryId;
	}

	public String getDescription() {
		return _description;
	}

	public long getImageId() {
		return _imageId;
	}

	public long getLocationId() {
		return _locationId;
	}

	public String getName() {
		return _name;
	}

	public String getUserId() {
		return _userId;
	}

	public void setCategoryId(long categoryId) {
		_categoryId = categoryId;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public void setImageId(long imageId) {
		_imageId = imageId;
	}

	public void setLocationId(long locationId) {
		_locationId = locationId;
	}

	public void setName(String name) {
		_name = name;
	}

	public void setUserId(String userId) {
		_userId = userId;
	}

	private long _categoryId = 0;
	private String _description = "";
	private long _imageId = 0;
	private long _locationId = 0;
	private String _name = "";
	private String _userId = "";

}
