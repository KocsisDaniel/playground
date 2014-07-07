package com.treasurehunter.server.cloudendpoint;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.treasurehunter.server.persistence.dao.CityDAO;
import com.treasurehunter.server.persistence.model.City;
import com.treasurehunter.server.persistence.model.Treasure;
import com.treasurehunter.server.util.TreasureUtil;

/**
 * @author Daniel Kocsis
 */
@Api(name = "myApi", version = "v1")
public class SampleEndpoint {

	@ApiMethod(name = "addCity")
	public City addCity(@Named("name") String name) {
		return CityDAO.getInstance().addCity(name);
	}

	@ApiMethod(name = "addTreasure")
	public Treasure addTreasure(
		@Named("location") String locationName,
		@Named("location_description") String locationDescription,
		double latitude, double longitude, double altitude,
		@Named("treasure_name") String treasureName,
		@Named("treasure_description") String treasureDescription,
		int treasureWeight) {

		return TreasureUtil.createTreasure(locationName, locationDescription,
			latitude, longitude, altitude, treasureName, treasureDescription,
			treasureWeight);
	}

}
