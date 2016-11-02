package org.tos.jartic.api.prozorro.v0070.model;

import java.util.ArrayList;

public class Award {
	/**
	 * id: рядок, генерується автоматично, лише для читання
	 * 
	 * OpenContracting Description: Ідентифікатор цього рішення.
	 */
	private String id;
	/**
	 * bid_id: рядок, генерується автоматично, лише для читання
	 * 
	 * ID пропозиції, що виграла закупівлю
	 */
	private String bid_id;
	/**
	 * title: рядок, багатомовний
	 * 
	 * OpenContracting Description: Назва рішення.
	 */
	private String title;
	/**
	 * description: рядок, багатомовний
	 * 
	 * OpenContracting Description: Опис рішення.
	 */
	private String description;
	/**
	 * status: рядок
	 * 
	 * OpenContracting Description: Поточний статус рішення, взятий зі списку
	 * кодів awardStatus.
	 * 
	 * Можливі значення:
	 * 
	 * pending - переможець розглядається кваліфікаційною комісією unsuccessful
	 * - кваліфікаційна комісія відмовила переможцю active - закупівлю виграв
	 * учасник з пропозицією bid_id cancelled - орган, що розглядає скарги,
	 * відмінив результати закупівлі
	 */
	private String status;
	/**
	 * date: рядок, Date, генерується автоматично, лише для читання
	 * 
	 * OpenContracting Description: Дата рішення про підписання договору.
	 */
	private Date date;
	/**
	 * value: О’єкт Value, генерується автоматично, лише для читання
	 * 
	 * OpenContracting Description: Загальна вартість згідно цього рішення.
	 */
	private Value value;
	/**
	 * suppliers: Список об’єктів Organization, генерується автоматично, лише
	 * для читання
	 * 
	 * OpenContracting Description: Постачальники, що були визнані переможцями
	 * згідно цього рішення.
	 */
	private ArrayList<Organization> suppliers = new ArrayList<>();
	/**
	 * items: Список об’єктів Item, генерується автоматично, лише для читання
	 * 
	 * OpenContracting Description: Товари та послуги, що розглядались цим
	 * рішенням, поділені на окремі рядки, де це можливо. Елементи не повинні
	 * бути продубльовані, а повинні мати вказану кількість.
	 */
	private ArrayList<Item> items = new ArrayList<>();
	/**
	 * documents: Список об’єктів Document
	 * 
	 * OpenContracting Description: Усі документи та додатки пов’язані з
	 * рішенням, включно з будь-якими повідомленнями.
	 */
	private ArrayList<Document> documents = new ArrayList<>();
	/**
	 * complaints: Список об’єктів Complaint
	 */
	private ArrayList<Complaint> complaints = new ArrayList<>();
	/**
	 * complaintPeriod:
	 * 
	 * Period
	 * 
	 * Період часу, під час якого можна подавати скарги.
	 */
	private Period complaintPeriod;
	/**
	 * lotID: рядок
	 * 
	 * ID пов’язаного Lot.
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
