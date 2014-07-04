package com.treasurehunter.server.persistence.model;

import java.awt.image.BufferedImage;

public class Image {

	public String getDescription() {
		return _description;
	}

	public java.awt.image.BufferedImage getImage() {
		return _image;
	}

	public long getImageId() {
		return _imageId;
	}

	public String getName() {
		return _name;
	}

	public void setDescription(String description) {
		this._description = description;
	}

	public void setImage(BufferedImage image) {
		this._image = image;
	}

	public void setImageId(long imageId) {
		_imageId = imageId;
	}

	public void setName(String name) {
		this._name = name;
	}

	private String _description = "";
	private java.awt.image.BufferedImage _image = null;
	private long _imageId = 0;
	private String _name = "";

}
