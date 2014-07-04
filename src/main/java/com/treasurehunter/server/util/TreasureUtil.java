package com.treasurehunter.server.util;

import com.treasurehunter.server.Image;
import com.treasurehunter.server.Location;
import com.treasurehunter.server.Treasure;

import java.awt.image.BufferedImage;

public class TreasureUtil {

	public static void createTreasure(
		String userId, double latitude, double longitude, double altitude,
		String locationName, String locationDescription, String imageName,
		String imageDescription, BufferedImage image, String treasureName,
		String treasureDescription, long categoryId) {

		//Create a new location
		Location location = new Location();
		location.setAltitude(altitude);
		location.setDescription(locationDescription);
		location.setLatitude(latitude);
		location.setLongitude(longitude);
		location.setName(locationName);

		//Create a new image
		Image treasureImage = new Image();
		treasureImage.setDescription(imageDescription);
		treasureImage.setImage(image);
		treasureImage.setName(imageName);

		//Create a new treasure
		Treasure treasure = new Treasure();
		treasure.setDescription(treasureDescription);
		treasure.setImageId(treasureImage.getImageId());
		treasure.setLocationId(location.getLocationId());
		treasure.setName(treasureName);
		treasure.setUserId(userId);
		treasure.setCategoryId(categoryId);
	}
}
