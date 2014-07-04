package com.treasurehunter.server.persistence.model;

import java.awt.image.BufferedImage;

public class Image {

	public String getDescription() {
		return _description;
	}

	public java.awt.image.BufferedImage getImage() {
		return _image;
	}

	public String getName() {
		return _name;
	}

	public void set_description(String description) {
		this._description = description;
	}

	public void set_image(BufferedImage image) {
		this._image = image;
	}

	public void set_name(String name) {
		this._name = name;
	}

	private String _name = "";
	private String _description = "";
	private java.awt.image.BufferedImage _image = null;

}
