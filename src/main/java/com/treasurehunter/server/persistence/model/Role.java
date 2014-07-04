package com.treasurehunter.server.persistence.model;

public class Role {

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

	private String _name = "";
	private String _role = "";

}
