package org.tos.jartic.api.prozorro.v0070.model;

public class Address {
	/**
	 * streetAddress: рядок
	 * 
	 * OpenContracting Description: Вулиця. Наприклад, вул.Хрещатик, 22.
	 */
	private String streetAddress;
	/**
	 * locality: рядок
	 * 
	 * OpenContracting Description: Населений пункт. Наприклад, Київ.
	 */
	private String locality;
	/**
	 * region: рядок
	 * 
	 * OpenContracting Description: Область. Наприклад, Київська.
	 */
	private String region;
	/**
	 * postalCode: рядок
	 * 
	 * OpenContracting Description: Поштовий індекс, Наприклад, 78043.
	 */
	private String postalCode;
	/**
	 * countryName: рядок, багатомовний, обов’язковий
	 * 
	 * OpenContracting Description: Назва країни. Наприклад, Україна.
	 */
	private String countryName;

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
