package org.tos.jartic.api.prozorro.v0070.model;

import java.util.ArrayList;

public class Cancellation {
	/**
	 * id: uid, ���������� �����������
	 */
	private String id;
	/**
	 * reason: �����, ������������, �����������
	 * 
	 * �������, � ��� ����������� ��������.
	 */
	private String reason;
	/**
	 * status: �����
	 * 
	 * ������ ��������: pending: �� �������������. ����� ������������.
	 * 
	 * active: ���������� ����������.
	 */
	private String status;
	/**
	 * documents: ������ �ᒺ��� Document
	 * 
	 * ��������� ������������ ����������: �������� ������ ���������� �������
	 * ��������� ��� ���������� �������.
	 */
	private ArrayList<Document> documents;
	/**
	 * date: �����, Date
	 * 
	 * ���� ����������
	 */
	private Date date;
	/**
	 * cancellationOf: �����
	 * 
	 * ������ ��������:
	 * 
	 * tender - �������� lot - ���
	 */
	private String cancellationOf;
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
