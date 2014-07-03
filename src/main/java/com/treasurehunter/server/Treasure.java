package com.treasurehunter.server;

/**
 * Created by FrosTi on 03/07/14.
 */
public class Treasure {

	public TreasureCategory getCategory() {
		return _category;
	}

	public String getDescription() {
		return _description;
	}

	public String getName() {
		return _name;
	}

	public Location getLocation() {
		return _location;
	}

	public void setCategory(TreasureCategory category) {
		this._category = _category;
	}

	public void setDescription(String description) {
		this._description = _description;
	}

	public void setName(String name) {
		_name = name;
	}

	public void setLocation(Location location) {
		this._location = _location;
	}

	private String _name = "";
	private String _description = "";
	private TreasureCategory _category = null;
	private Location _location;

}
