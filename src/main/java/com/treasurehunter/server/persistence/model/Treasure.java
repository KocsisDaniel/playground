package com.treasurehunter.server.persistence.model;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class Treasure {

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

	@Persistent
	private String _description;
	@Persistent
	private String _name;

}
