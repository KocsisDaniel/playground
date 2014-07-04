package com.treasurehunter.server.persistence.model;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class Image extends DataStoreModel {

	public String getDescription() {
		return _description;
	}

	public String getName() {
		return _name;
	}

	public void setDescription(String description) {
		this._description = description;
	}

	public void setName(String name) {
		_name = name;
	}

	@Persistent
	private String _description;
	@Persistent
	private String _name;

}
