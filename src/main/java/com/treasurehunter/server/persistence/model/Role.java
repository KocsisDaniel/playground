package com.treasurehunter.server.persistence.model;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class Role extends DataStoreModel {

	public String getName() {
		return _name;
	}

	public String getRole() {
		return _role;
	}

	public void setName(String name) {
		_name = name;
	}

	public void setRole(String role) {
		_role = role;
	}

	@Persistent
	private String _name;
	@Persistent
	private String _role;

}
