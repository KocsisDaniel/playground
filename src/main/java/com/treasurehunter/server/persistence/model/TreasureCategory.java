package com.treasurehunter.server.persistence.model;

public class TreasureCategory {

	public String getDescription() {
		return _description;
	}

	public String getName() {
		return _name;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public void setName(String name) {
		_name = name;
	}

	private String _name = "";
	private String _description = "";

}
