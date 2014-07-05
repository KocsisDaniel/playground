package com.treasurehunter.server.cloudendpoint;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.treasurehunter.server.persistence.dao.CityDAO;
import com.treasurehunter.server.persistence.model.City;

/**
 * @author Daniel Kocsis
 */
@Api(name = "myApi",
	version = "v1",
	namespace = @ApiNamespace(ownerDomain = "treasurehunter.com",
	ownerName = "treasurehunter.com",
	packagePath=""))
public class SampleEndpoint {

	@ApiMethod(name = "addCity")
	public City addCity(@Named("name") String name) {
		return CityDAO.getInstance().addCity(name);
	}

}
