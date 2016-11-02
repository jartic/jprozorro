package org.tos.jartic.api.prozorro.v0070.model;

import java.util.ArrayList;

public class Contract {
	/**
	 * id: uid, генерується автоматично
	 * 
	 * OpenContracting Description: Ідентифікатор цього договору.
	 */
	private String id;
	/**
	 * awardID: рядок, обов’язковий
	 * 
	 * OpenContracting Description: Award.id вказує на рішення, згідно якого
	 * видається договір.
	 */
	private String awardID;
	/**
	 * contractID: рядок, генерується автоматично, лише для читання
	 */
	private String contractID;
	/**
	 * contractNumber: рядок
	 */
	private String contractNumber;
	/**
	 * title: рядок, обов’язковий
	 * 
	 * OpenContracting Description: Назва договору
	 */
	private String title;
	/**
	 * description: рядок
	 * 
	 * OpenContracting Description: Опис договору
	 */
	private String description;
	/**
	 * value: Об’єкт Value, генерується автоматично, лише для читання
	 * 
	 * OpenContracting Description: Загальна вартість договору.
	 */
	private Value value;
	/**
	 * items: Список об’єктів Item, генерується автоматично, лише для читання
	 * 
	 * OpenContracting Description: Товари, послуги та інші нематеріальні
	 * результати у цій угоді. Зверніть увагу: Якщо список співпадає з
	 * визначенням переможця award, то його не потрібно повторювати.
	 */
	private ArrayList<Item> items = new ArrayList<>();
	/**
	 * suppliers: Список об’єктів Organization, генерується автоматично, лише
	 * для читання
	 */
	private ArrayList<Organization> suppliers = new ArrayList<>();
	/**
	 * status: рядок, обов’язковий
	 * 
	 * OpenContracting Description: Поточний статус договору.
	 * 
	 * Можливі значення:
	 * 
	 * pending - цей договір запропоновано, але він ще не діє. Можливо
	 * очікується його підписання. active - цей договір підписаний всіма
	 * учасниками, і зараз діє на законних підставах. cancelled - цей договір
	 * було скасовано до підписання.
	 */
	private String status;
	/**
	 * period: Period
	 * 
	 * OpenContracting Description: Дата початку та завершення договору.
	 */
	private Period period;
	/**
	 * dateSigned: рядок, Date
	 * 
	 * OpenContracting Description: Дата підписання договору. Якщо було декілька
	 * підписань, то береться дата останнього підписання.
	 */
	private Date dateSigned;
	/**
	 * date: рядок, Date
	 * 
	 * Дата, коли договір був змінений або активований.
	 */
	private Date date;
	/**
	 * documents: Список об’єктів Document
	 * 
	 * OpenContracting Description: Усі документи та додатки пов’язані з
	 * договором, включно з будь-якими повідомленнями.
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
