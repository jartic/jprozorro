package org.tos.jartic.api.prozorro.v0070.model;

import java.util.ArrayList;

public class Bid {
	/**
	 * tenderers: Список об’єктів Organization
	 */
	private ArrayList<Organization> tenderers;
	/**
	 * date: рядок, Date, генерується автоматично
	 */
	private Date date;
	/**
	 * id: uid, генерується автоматично
	 */
	private String id;
	/**
	 * status: рядок
	 * 
	 * Можливі значення:
	 * 
	 * draft active
	 */
	private String status;
	/**
	 * value: Value, обов’язково
	 * 
	 * Правила валідації:
	 * 
	 * Значення amount повинно бути меншим за Tender.value.amout Значення
	 * currency повинно бути або відсутнім, або співпадати з
	 * Tender.value.currency Значення valueAddedTaxIncluded повинно бути або
	 * відсутнім, або співпадати з Tender.value.valueAddedTaxIncluded
	 */
	private Value value;
	/**
	 * documents: Список об’єктів Document
	 */
	private ArrayList<Document> documents = new ArrayList<>();
	/**
	 * parameters: Список об’єктів Parameter
	 */
	private ArrayList<Parameter> parameters = new ArrayList<>();
	/**
	 * lotValues: Список об’єктів LotValue
	 */
	private ArrayList<LotValue> lotValues = new ArrayList<>();
	/**
	 * participationUrl:
	 * 
	 * URL-адреса
	 * 
	 * Веб-адреса для участі в аукціоні.
	 */
	private String participationUrl;

	public ArrayList<Organization> getTenderers() {
		return tenderers;
	}

	public void setTenderers(ArrayList<Organization> tenderers) {
		this.tenderers = tenderers;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public ArrayList<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(ArrayList<Document> documents) {
		this.documents = documents;
	}

	public ArrayList<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(ArrayList<Parameter> parameters) {
		this.parameters = parameters;
	}

	public ArrayList<LotValue> getLotValues() {
		return lotValues;
	}

	public void setLotValues(ArrayList<LotValue> lotValues) {
		this.lotValues = lotValues;
	}

	public String getParticipationUrl() {
		return participationUrl;
	}

	public void setParticipationUrl(String participationUrl) {
		this.participationUrl = participationUrl;
	}

}
