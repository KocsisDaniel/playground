package com.treasurehunter.server.persistence.model;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable(detachable="true")
public class City extends DataStoreModel {

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	@Persistent
	private String _name;

}
