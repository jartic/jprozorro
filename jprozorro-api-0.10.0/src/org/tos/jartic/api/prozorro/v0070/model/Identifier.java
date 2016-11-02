package org.tos.jartic.api.prozorro.v0070.model;

public class Identifier {
	/**
	 * scheme: �����
	 * 
	 * OpenContracting Description: �������������� ���������� �������� �
	 * ������� ����� �������������. �� ���� ����� ����� ��� ������ ����, ��
	 * ����� ������ ������������� ����������. �� �������� ������� ������� �
	 * ����� ������������� ����������.
	 */
	private String scheme;
	/**
	 * id: �����, �����������
	 * 
	 * OpenContracting Description: ������������� ���������� � ������� ����.
	 * 
	 * ����������� � ���� � ����� ���� �Organisation Registration Agency�
	 * ��������� IATI � ���������� ���� UA-EDR ��� ����������, ������������� �
	 * ����� (������ �� ���).
	 */
	private String id;
	/**
	 * legalName: �����, ������������
	 * 
	 * OpenContracting Description: �������� ������������ ����� ����������.
	 */
	private String legalName;
	/**
	 * uri: uri
	 * 
	 * OpenContracting Description: URI ��� ������������� ����������,
	 * ���������, �, �� ������� Open Corporates ��� ���� ������������� URI. ��
	 * �� ��� �������� ����������, ���� ����� ������ � ��� url � ContactPoint
	 * ����������.
	 */
	private String uri;

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}
