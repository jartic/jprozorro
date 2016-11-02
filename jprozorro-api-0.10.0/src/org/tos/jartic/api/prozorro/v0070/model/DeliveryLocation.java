package org.tos.jartic.api.prozorro.v0070.model;

public class DeliveryLocation {
	/**
	 * latitude: рядок, обов’язковий
	 */
	private String latitude;
	/**
	 * longitude: рядок, обов’язковий
	 */
	private String longitude;
	/**
	 * elevation: рядок, не обов’язково, переважно не використовується
	 * 
	 */
	private String elevation;

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getElevation() {
		return elevation;
	}

	public void setElevation(String elevation) {
		this.elevation = elevation;
	}

}
