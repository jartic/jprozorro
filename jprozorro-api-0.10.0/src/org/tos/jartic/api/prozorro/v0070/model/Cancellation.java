package org.tos.jartic.api.prozorro.v0070.model;

import java.util.ArrayList;

public class Cancellation {
	/**
	 * id: uid, генерується автоматично
	 */
	private String id;
	/**
	 * reason: рядок, багатомовний, обов’язковий
	 * 
	 * Причина, з якої скасовується закупівля.
	 */
	private String reason;
	/**
	 * status: рядок
	 * 
	 * Можливі значення: pending: За замовчуванням. Запит оформляється.
	 * 
	 * active: Скасування активоване.
	 */
	private String status;
	/**
	 * documents: Список об’єктів Document
	 * 
	 * Супровідна документація скасування: Протокол рішення Тендерного комітету
	 * Замовника про скасування закупівлі.
	 */
	private ArrayList<Document> documents;
	/**
	 * date: рядок, Date
	 * 
	 * Дата скасування
	 */
	private Date date;
	/**
	 * cancellationOf: рядок
	 * 
	 * Можливі значення:
	 * 
	 * tender - закупівля lot - лот
	 */
	private String cancellationOf;
	/**
	 * relatedLot: рядок
	 * 
	 * ID пов’язаного Lot.
	 */
	private String relatedLot;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ArrayList<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(ArrayList<Document> documents) {
		this.documents = documents;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCancellationOf() {
		return cancellationOf;
	}

	public void setCancellationOf(String cancellationOf) {
		this.cancellationOf = cancellationOf;
	}

	public String getRelatedLot() {
		return relatedLot;
	}

	public void setRelatedLot(String relatedLot) {
		this.relatedLot = relatedLot;
	}

}
