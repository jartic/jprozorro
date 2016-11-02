package org.tos.jartic.api.prozorro.v0070.model;

import java.util.ArrayList;

public class Item {
	/**
	 * id: �����, ���������� �����������
	 */
	private String id;
	/**
	 * description: �����, ������������, �����������
	 * 
	 * OpenContracting Description: ���� ������ �� ������, �� ������ ����
	 * �����.
	 */
	private String description;
	/**
	 * classification: Classification
	 * 
	 * OpenContracting Description: ��������� ������������ ��������. ������� �
	 * itemClassificationScheme, ��� ��������� ����� ������ ������������,
	 * ������� � CPV �� GSIN.
	 * 
	 * ������������ classification.scheme ���������� ������� ���� CPV.
	 * classification.id ������� ���� ������ CPV �����.
	 */
	private Classification classification;
	/**
	 * additionalClassifications:
	 * 
	 * ������ �ᒺ��� Classification
	 * 
	 * OpenContracting Description: ����� ���������� ������������ ��� ��������.
	 * ������� � ������ ���� itemClassificationScheme, ��� �����������
	 * ������� ������� � OCDS. ����� ����� ��������������� ��� �������������
	 * ���� � ��������� ����� ������������.
	 * 
	 * ���������� ���� ���� � ���� ������� � ���� � ������ scheme.
	 */
	private ArrayList<Classification> additionalClassifications = new ArrayList<>();
	/**
	 * unit: Unit
	 * 
	 * OpenContracting Description: ���� ������� ����� ������, ���������,
	 * ������, ��������. ���������� � ����� ������� �� �������� ����
	 * �������.
	 */
	private Unit unit;
	/**
	 * quantity: ���� �����
	 * 
	 * OpenContracting Description: ʳ������ ���������� �������.
	 */
	private int quantity;
	/**
	 * deliveryDate: Period
	 * 
	 * �����, �������� ����� ������� ������� ���� �����������.
	 */
	private Period deliveryDate;
	/**
	 * deliveryAddress:
	 * 
	 * Address
	 * 
	 * ������ ����, ���� ������� ������� ���� �����������.
	 */
	private Address deliveryAddress;
	/**
	 * deliveryLocation:
	 * 
	 * �������
	 * 
	 * ���������� ���������� ���� ��������. ���������� � ����� ����������:
	 * 
	 * latitude: �����, ����������� longitude: �����, ����������� elevation:
	 * �����, �� ����������, ��������� �� ��������������� deliveryLocation
	 * �������� �� ����� �������� �� deliveryAddress, ���� ���� ������
	 * ������.
	 */
	private DeliveryLocation deliveryLocation;
	/**
	 * relatedLot: �����
	 * 
	 * ID ���������� Lot.
	 */
	private String relatedLot;
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
	public Classification getClassification() {
		return classification;
	}
	public void setClassification(Classification classification) {
		this.classification = classification;
	}
	public ArrayList<Classification> getAdditionalClassifications() {
		return additionalClassifications;
	}
	public void setAdditionalClassifications(ArrayList<Classification> additionalClassifications) {
		this.additionalClassifications = additionalClassifications;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Period getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Period deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Address getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public DeliveryLocation getDeliveryLocation() {
		return deliveryLocation;
	}
	public void setDeliveryLocation(DeliveryLocation deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}
	public String getRelatedLot() {
		return relatedLot;
	}
	public void setRelatedLot(String relatedLot) {
		this.relatedLot = relatedLot;
	}
	
	
}
