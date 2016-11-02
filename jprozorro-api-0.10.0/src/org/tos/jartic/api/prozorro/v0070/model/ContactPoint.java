package org.tos.jartic.api.prozorro.v0070.model;

public class ContactPoint {
	/**
	 * name: �����, ������������, �����������
	 * 
	 * OpenContracting Description: ��� ��������� �����, ����� ����� ��
	 * ����������� ������ ��� ����������, �� ��������� ����� ������� ���������
	 * ��������.
	 */
	private String name;
	/**
	 * email: email
	 * 
	 * OpenContracting Description: ������ ���������� ����� ���������
	 * �����/������.
	 */
	private String email;
	/**
	 * telephone: �����
	 * 
	 * OpenContracting Description: ����� �������� ��������� �����/������.
	 * ������� �������� ���������� ���������� ���.
	 */
	private String telephone;
	/**
	 * faxNumber: �����
	 * 
	 * OpenContracting Description: ����� ����� ��������� �����/������. �������
	 * �������� ���������� ���������� ���.
	 */
	private String faxNumber;
	/**
	 * url: url
	 * 
	 * OpenContracting Description: ��� ������ ��������� �����/������.
	 */
	private String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
