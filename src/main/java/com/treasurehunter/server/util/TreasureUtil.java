package com.treasurehunter.server.util;


import com.treasurehunter.server.persistence.model.Image;
import com.treasurehunter.server.persistence.model.Location;
import com.treasurehunter.server.persistence.model.Treasure;

public class TreasureUtil {

	public static void createTreasure(
		String userId, double latitude, double longitude, double altitude,
		String locationName, String locationDescription, String imageName,
		String imageDescription, String treasureName,
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
		treasureImage.setName(imageName);

		//Create a new treasure
		Treasure treasure = new Treasure();
		treasure.setDescription(treasureDescription);
		treasure.setName(treasureName);
	}

}
