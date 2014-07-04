package com.treasurehunter.server.persistence.model;

public class TreasureCategory {

	public long getCategoryId(){
		return _categoryId;
	}

	public String getDescription() {
		return _description;
	}

	public String getName() {
		return _name;
	}

	public void setCategoryId(long categoryId) {
		_categoryId = categoryId;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public void setName(String name) {
		_name = name;
	}

	private long _categoryId = 0;
	private String _description = "";
	private String _name = "";

}
