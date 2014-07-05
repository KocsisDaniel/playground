package com.treasurehunter.server.util;


import com.treasurehunter.server.persistence.dao.LocationDAO;
import com.treasurehunter.server.persistence.dao.TreasureDAO;
import com.treasurehunter.server.persistence.model.Location;
import com.treasurehunter.server.persistence.model.Treasure;

public class TreasureUtil {

	public static void createTreasure(
		String userId, String locationName, String locationDescription,
		double latitude, double longitude, double altitude, String treasureName,
		String treasureDescription, int treasureWeight) {

		//Create a new location
		Location location = LocationDAO.getInstance().addLocation(
			locationName, locationDescription, latitude, longitude, altitude);

		if (location == null) {
			return;
		}

		//Create a new treasure
		Treasure treasure = TreasureDAO.getInstance().addTreasure(
			treasureName, treasureDescription, location, treasureWeight);
	}

}
