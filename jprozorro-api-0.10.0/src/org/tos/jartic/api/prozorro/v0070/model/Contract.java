package org.tos.jartic.api.prozorro.v0070.model;

import java.util.ArrayList;

public class Contract {
	/**
	 * id: uid, ���������� �����������
	 * 
	 * OpenContracting Description: ������������� ����� ��������.
	 */
	private String id;
	/**
	 * awardID: �����, �����������
	 * 
	 * OpenContracting Description: Award.id ����� �� ������, ����� �����
	 * �������� ������.
	 */
	private String awardID;
	/**
	 * contractID: �����, ���������� �����������, ���� ��� �������
	 */
	private String contractID;
	/**
	 * contractNumber: �����
	 */
	private String contractNumber;
	/**
	 * title: �����, �����������
	 * 
	 * OpenContracting Description: ����� ��������
	 */
	private String title;
	/**
	 * description: �����
	 * 
	 * OpenContracting Description: ���� ��������
	 */
	private String description;
	/**
	 * value: �ᒺ�� Value, ���������� �����������, ���� ��� �������
	 * 
	 * OpenContracting Description: �������� ������� ��������.
	 */
	private Value value;
	/**
	 * items: ������ �ᒺ��� Item, ���������� �����������, ���� ��� �������
	 * 
	 * OpenContracting Description: ������, ������� �� ���� �����������
	 * ���������� � ��� ����. ������� �����: ���� ������ ������� �
	 * ����������� ��������� award, �� ���� �� ������� �����������.
	 */
	private ArrayList<Item> items = new ArrayList<>();
	/**
	 * suppliers: ������ �ᒺ��� Organization, ���������� �����������, ����
	 * ��� �������
	 */
	private ArrayList<Organization> suppliers = new ArrayList<>();
	/**
	 * status: �����, �����������
	 * 
	 * OpenContracting Description: �������� ������ ��������.
	 * 
	 * ������ ��������:
	 * 
	 * pending - ��� ������ �������������, ��� �� �� �� 䳺. �������
	 * ��������� ���� ���������. active - ��� ������ ��������� ����
	 * ����������, � ����� 䳺 �� �������� ��������. cancelled - ��� ������
	 * ���� ��������� �� ���������.
	 */
	private String status;
	/**
	 * period: Period
	 * 
	 * OpenContracting Description: ���� ������� �� ���������� ��������.
	 */
	private Period period;
	/**
	 * dateSigned: �����, Date
	 * 
	 * OpenContracting Description: ���� ��������� ��������. ���� ���� �������
	 * ��������, �� �������� ���� ���������� ���������.
	 */
	private Date dateSigned;
	/**
	 * date: �����, Date
	 * 
	 * ����, ���� ������ ��� ������� ��� �����������.
	 */
	private Date date;
	/**
	 * documents: ������ �ᒺ��� Document
	 * 
	 * OpenContracting Description: �� ��������� �� ������� ������� �
	 * ���������, ������� � ����-����� �������������.
	 */
	private ArrayList<Document> documents;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAwardID() {
		return awardID;
	}

	public void setAwardID(String awardID) {
		this.awardID = awardID;
	}

	public String getContractID() {
		return contractID;
	}

	public void setContractID(String contractID) {
		this.contractID = contractID;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
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

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public ArrayList<Organization> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(ArrayList<Organization> suppliers) {
		this.suppliers = suppliers;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public Date getDateSigned() {
		return dateSigned;
	}

	public void setDateSigned(Date dateSigned) {
		this.dateSigned = dateSigned;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ArrayList<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(ArrayList<Document> documents) {
		this.documents = documents;
	}

}
