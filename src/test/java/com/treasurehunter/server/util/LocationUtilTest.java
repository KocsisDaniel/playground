package com.treasurehunter.server.util;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * @author Levente Hudák
 */
public class LocationUtilTest extends TestCase {
	public void testGetDistanceInKilometers() throws Exception {
		double lat1 = 47.958706235886595;
		double long1 = 21.7178276181221;
		double lat2 = 47.96219790007489;
		double long2 = 21.678468883037567;

		double distance = LocationUtil.getDistanceInKilometers(
			lat1, long1, lat2, long2);

		Assert.assertEquals(4.3, distance, 0.5);
	}

	public void testGetDistanceInKilometersWithAltitude() throws Exception {
		double lat1 = 47;
		double long1 = 21;
		double alt1 = 0;
		double lat2 = 47;
		double long2 = 21;
		double alt2 = 100;

		double distance = LocationUtil.getDistanceInKilometersWithAltitude(
			lat1, long1, alt1, lat2, long2, alt2);

		Assert.assertEquals(0.1, distance, 0.1);
	}

	public void testGetDistanceInMiles() throws Exception {
		double lat1 = 47.958706235886595;
		double long1 = 21.7178276181221;
		double lat2 = 47.96219790007489;
		double long2 = 21.678468883037567;

		double distance = LocationUtil.getDistanceInMiles(
			lat1, long1, lat2, long2);

		Assert.assertEquals(2.7, distance, 0.1);
	}

}