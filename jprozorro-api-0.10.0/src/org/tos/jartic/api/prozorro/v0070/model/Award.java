package org.tos.jartic.api.prozorro.v0070.model;

import java.util.ArrayList;

public class Award {
	/**
	 * id: �����, ���������� �����������, ���� ��� �������
	 * 
	 * OpenContracting Description: ������������� ����� ������.
	 */
	private String id;
	/**
	 * bid_id: �����, ���������� �����������, ���� ��� �������
	 * 
	 * ID ����������, �� ������� ��������
	 */
	private String bid_id;
	/**
	 * title: �����, ������������
	 * 
	 * OpenContracting Description: ����� ������.
	 */
	private String title;
	/**
	 * description: �����, ������������
	 * 
	 * OpenContracting Description: ���� ������.
	 */
	private String description;
	/**
	 * status: �����
	 * 
	 * OpenContracting Description: �������� ������ ������, ������ � ������
	 * ���� awardStatus.
	 * 
	 * ������ ��������:
	 * 
	 * pending - ���������� ������������ �������������� ����� unsuccessful
	 * - ������������� ����� �������� ��������� active - �������� ������
	 * ������� � ����������� bid_id cancelled - �����, �� �������� ������,
	 * ������ ���������� �������
	 */
	private String status;
	/**
	 * date: �����, Date, ���������� �����������, ���� ��� �������
	 * 
	 * OpenContracting Description: ���� ������ ��� ��������� ��������.
	 */
	private Date date;
	/**
	 * value: Β��� Value, ���������� �����������, ���� ��� �������
	 * 
	 * OpenContracting Description: �������� ������� ����� ����� ������.
	 */
	private Value value;
	/**
	 * suppliers: ������ �ᒺ��� Organization, ���������� �����������, ����
	 * ��� �������
	 * 
	 * OpenContracting Description: �������������, �� ���� ������ �����������
	 * ����� ����� ������.
	 */
	private ArrayList<Organization> suppliers = new ArrayList<>();
	/**
	 * items: ������ �ᒺ��� Item, ���������� �����������, ���� ��� �������
	 * 
	 * OpenContracting Description: ������ �� �������, �� ������������ ���
	 * �������, ������ �� ����� �����, �� �� �������. �������� �� ������
	 * ���� ������������, � ������ ���� ������� �������.
	 */
	private ArrayList<Item> items = new ArrayList<>();
	/**
	 * documents: ������ �ᒺ��� Document
	 * 
	 * OpenContracting Description: �� ��������� �� ������� ������� �
	 * �������, ������� � ����-����� �������������.
	 */
	private ArrayList<Document> documents = new ArrayList<>();
	/**
	 * complaints: ������ �ᒺ��� Complaint
	 */
	private ArrayList<Complaint> complaints = new ArrayList<>();
	/**
	 * complaintPeriod:
	 * 
	 * Period
	 * 
	 * ����� ����, �� ��� ����� ����� �������� ������.
	 */
	private Period complaintPeriod;
	/**
	 * lotID: �����
	 * 
	 * ID ���������� Lot.
	 */
	private String lotID;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBid_id() {
		return bid_id;
	}

	public void setBid_id(String bid_id) {
		this.bid_id = bid_id;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public ArrayList<Organization> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(ArrayList<Organization> suppliers) {
		this.suppliers = suppliers;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public ArrayList<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(ArrayList<Document> documents) {
		this.documents = documents;
	}

	public ArrayList<Complaint> getComplaints() {
		return complaints;
	}

	public void setComplaints(ArrayList<Complaint> complaints) {
		this.complaints = complaints;
	}

	public Period getComplaintPeriod() {
		return complaintPeriod;
	}

	public void setComplaintPeriod(Period complaintPeriod) {
		this.complaintPeriod = complaintPeriod;
	}

	public String getLotID() {
		return lotID;
	}

	public void setLotID(String lotID) {
		this.lotID = lotID;
	}

}
