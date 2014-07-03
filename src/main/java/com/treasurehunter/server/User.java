package com.treasurehunter.server;

import java.util.ArrayList;
import java.util.List;

public class User {

	public void addTreasure(Treasure treasure) {
		_treasures.add(treasure);
	}

	public void removeTreasure(Treasure treasure) {
		_treasures.remove(treasure);
	}

	public City getCity() {
		return _city;
	}

	public Role getRole() {
		return _role;
	}

	public List<Treasure> getTreasures() {
		return _treasures;
	}

	public void setCity(City _city) {
		this._city = _city;
	}

	public void setRole(Role role) {
		_role = role;
	}

	private Role _role = null;
	private java.util.List<Treasure> _treasures = new ArrayList<>();
	private City _city = null;

}
