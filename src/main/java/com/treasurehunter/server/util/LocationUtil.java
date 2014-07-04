package com.treasurehunter.server.util;

public class LocationUtil {

	public static int getDistanceInMiles(
		double lat1, double long1, double lat2, double long2) {

		return (int)(1000D * getDistanceInKilometers(lat1, long1, lat2, long2));
	}

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

	private static final double _eQuatorialEarthRadius = 6378.1370D;
	private static final double _d2r = (Math.PI / 180D);

}
