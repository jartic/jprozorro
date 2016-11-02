package org.tos.jartic.api.prozorro.v0070.model;

import java.util.ArrayList;

public class Feature {
	/**
	 * code: �����, ���������� �����������
	 * 
	 * ��� ���������� �������.
	 */
	private String code;
	/**
	 * featureOf: �����, �����������
	 * 
	 * ������ ��������:
	 * 
	 * tenderer - ������� ������� lot item
	 */
	private String featureOf;
	/**
	 * relatedItem: �����
	 * 
	 * ID ���������� Item ��� Lot (���� �������� featureOf ������� item ���
	 * lot).
	 */
	private String relatedItem;
	/**
	 * title: �����, ������������, �����������
	 * 
	 * ����� �������.
	 */
	private String title;
	/**
	 * description: �����, ������������
	 * 
	 * ���� �������.
	 */
	private String description;
	/**
	 * enum: ������
	 * 
	 * ������ �������:
	 * 
	 * value: float, ����������
	 * 
	 * �������� �������. title: �����, ������������, �����������
	 * 
	 * ����� ��������. description: �����, ������������
	 * 
	 * ���� ��������.
	 */
	private ArrayList<Enum> enumList = new ArrayList<>();

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFeatureOf() {
		return featureOf;
	}

	public void setFeatureOf(String featureOf) {
		this.featureOf = featureOf;
	}

	public String getRelatedItem() {
		return relatedItem;
	}

	public void setRelatedItem(String relatedItem) {
		this.relatedItem = relatedItem;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Enum> getEnumList() {
		return enumList;
	}

	public void setEnumList(ArrayList<Enum> enumList) {
		this.enumList = enumList;
	}

}
