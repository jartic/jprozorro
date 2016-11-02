package org.tos.jartic.api.prozorro.v0070.model;

public class Classification {
	/**
	 * scheme: �����
	 * 
	 * OpenContracting Description: ������������ ������� ���� ����� � �������
	 * ����� ��� ������ ����. �� ���� ���������������, ��� �������
	 * �����/������ ����, � ���� ���� ������� ������������. ��� ������������
	 * ������ �������� �� �������� ������� ������������ ����� �����
	 * ������������ ��������, �� �� �������.
	 */
	private String scheme;
	/**
	 * id: �����
	 * 
	 * OpenContracting Description: ��� ������������ ������ � ������� �����.
	 */
	private String id;
	/**
	 * description: �����
	 * 
	 * OpenContracting Description: ��������� ���� ��� ����� ����.
	 */
	private String description;
	/**
	 * uri: uri
	 * 
	 * OpenContracting Description: URI ��� ������������� ����. ����
	 * ����������� URI �� ������� ��� �������� � ���� ������������� ��
	 * �������� ����� �������� ������.
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}
