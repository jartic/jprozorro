package org.tos.jartic.api.prozorro.v0070.model;

public class Address {
	/**
	 * streetAddress: �����
	 * 
	 * OpenContracting Description: ������. ���������, ���.��������, 22.
	 */
	private String streetAddress;
	/**
	 * locality: �����
	 * 
	 * OpenContracting Description: ��������� �����. ���������, ���.
	 */
	private String locality;
	/**
	 * region: �����
	 * 
	 * OpenContracting Description: �������. ���������, �������.
	 */
	private String region;
	/**
	 * postalCode: �����
	 * 
	 * OpenContracting Description: �������� ������, ���������, 78043.
	 */
	private String postalCode;
	/**
	 * countryName: �����, ������������, �����������
	 * 
	 * OpenContracting Description: ����� �����. ���������, ������.
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
