package com.treasurehunter.server.util;

/**
 * @author Levente Hudák
 */
public class LocationUtil {

	/**
	 * Returns distance in kilometers based on two points given by Latitude and
	 * Longitude
	 * @param lat1 Start latitude
	 * @param long1 Start longitude
	 * @param lat2 Destination latitude
	 * @param long2 Destination longitude
	 * @return Distance in kilometers as double
	 */
	public static double getDistanceInKilometers(
		double lat1, double long1, double lat2, double long2) {

		double dLong = (long2 - long1) * _d2r;
		double dLat = (lat2 - lat1) * _d2r;
		double a = Math.pow(
			Math.sin(dLong / 2D), 2D) + Math.cos(lat1 * _d2r) *
			Math.cos(lat2 * _d2r) * Math.pow(Math.sin(dLat / 2D), 2D);
		double c = 2D * Math.atan2(Math.sqrt(a), Math.sqrt(1D - a));
		double d = _eQuatorialEarthRadius * c;

		return d;
	}

	public static double getDistanceInKilometersWithAltitude(
		double lat1, double long1, double alt1, double lat2, double long2,
		double alt2) {

		double a2 =
			Math.pow(getDistanceInKilometers(lat1, long1, lat2, long2), 2);

		double b2 = Math.pow((Math.abs(alt2 - alt1) / 1000), 2);

		double c2 = a2 + b2;

		return Math.sqrt(c2);
	}

	/**
	 * Returns distance in miles based on two points given by Latitude and
	 * Longitude
	 * @param lat1 Start latitude
	 * @param long1 Start longitude
	 * @param lat2 Destination latitude
	 * @param long2 Destination longitude
	 * @return Distance in miles as double
	 */
	public static double getDistanceInMiles(
		double lat1, double long1, double lat2, double long2) {

		return (
			_oneMileInKilometers *
			getDistanceInKilometers(lat1, long1, lat2, long2));
	}

	private static final double _eQuatorialEarthRadius = 6378.1370D;
	private static final double _d2r = (Math.PI / 180D);
	private static final double _oneMileInKilometers = 0.621371192;

}
