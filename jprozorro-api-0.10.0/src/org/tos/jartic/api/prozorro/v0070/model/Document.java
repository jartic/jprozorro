package org.tos.jartic.api.prozorro.v0070.model;

public class Document {
	/**
	 * id: �����, ���������� �����������
	 */
	private String id;
	/**
	 * documentType: �����
	 * 
	 * ������ �������� ��� Tender
	 * 
	 * notice - ����������� ��� ��������
	 * 
	 * �������� �����������, �� ������ ����� �������. �� ���� ����
	 * ��������� �� ��������, ���-�������, �� �� ��������� ��������, ��
	 * �������� �����������. biddingDocuments - ��������� �������
	 * 
	 * ���������� ��� ����������� �������������, �� ����� ��� ��������
	 * (���������, ������ �� �������, �� ������ ��������) � ������ �����.
	 * technicalSpecifications - ������ ������������
	 * 
	 * �������� ������� ���������� ��� ������ ��� �������, �� ������ ����
	 * �����. evaluationCriteria - ������ ������
	 * 
	 * ���������� ��� ��, �� ������ ����������� ����������. clarifications -
	 * ��������� �� ������ ������� ����������
	 * 
	 * ������ ������ �� �������, ����� �� �������������� ������������.
	 * eligibilityCriteria - ������ �����������
	 * 
	 * ������� ��������� ��� ������ ������. shortlistedFirms - Գ��� �
	 * ��������� ������ riskProvisions - ��������� ��� ��������� �������� ��
	 * ������������� billOfQuantity - �������� bidders - ���������� ���
	 * ��������
	 * 
	 * ���������� ��� ��������, ��� ��������� ��� �������� �� ����-��
	 * ����������� �����, �� �� ���� ������ ������������. conflictOfInterest
	 * - ������� �������� �������� debarments - ³����� � ������� ��
	 * ������� contractProforma - ������ �������� ������ �������� ��� Award
	 * 
	 * notice - ����������� ��� ������
	 * 
	 * �������� �����������, �� ������ ����� ������ ��� ����������
	 * ���������. �� ���� ���� ��������� �� ��������, ���-�������, �� ��
	 * ��������� ��������, �� �������� �����������. evaluationReports - ���
	 * ��� ������
	 * 
	 * ��� ��� ������ ���������� � ������������ ������� ������, � ���� ����,
	 * ������������ ������ ��� ���������� ���������. winningBid - ����������,
	 * �� ��������� complaints - ������ �� ������ ������ �������� ��� Contract
	 * 
	 * notice - ����������� ��� ������
	 * 
	 * �������� �����������, �� ������ ����� ��������� �������� �� �������
	 * ���� ���������. �� ���� ���� ��������� �� ��������, ���-�������, �� ��
	 * ��������� ��������, �� �������� �����������. contractSigned -
	 * ϳ�������� ������ contractArrangements - ������ ��� ���������� ��������
	 * contractSchedule - ������� �� ����� contractAnnexe - ������� �� ��������
	 * contractGuarantees - ������������ ��������� ���������� subContract -
	 * �������� ������ �������� ��� Bid
	 * 
	 * commercialProposal - ֳ���� ���������� qualificationDocuments -
	 * ���������, �� ������������ ����������� eligibilityDocuments -
	 * ���������, �� ������������ ���������� (� ���� ����, ����������
	 * ������� ��. 17)
	 */
	private String documentType;
	/**
	 * title: �����, ������������
	 * 
	 * OpenContracting Description: ����� ���������.
	 */
	private String title;
	/**
	 * description: �����, ������������
	 * 
	 * OpenContracting Description: �������� ���� ���������. ���� �������� ��
	 * ���� ��������� ������, �� ���� ����� ����� ����������� ��� ��������
	 * ������� ��������� ��ﳿ ���������.
	 */
	private String description;
	/**
	 * format: �����
	 * 
	 * OpenContracting Description: ������ ��������� � ������ ���� IANA Media
	 * Types, � ����� ���������� ��������� �offline/print�, �� ����
	 * �����������������, ���� ����� ����� ��������� ��������������� ��� �����
	 * ��������� ��������� ���������.
	 */
	private String format;
	/**
	 * url: �����, ���������� �����������
	 * 
	 * OpenContracting Description: ����� ��������� �� �������� �� �������.
	 */
	private String url;
	/**
	 * datePublished: �����, Date
	 * 
	 * OpenContracting Description: ����, ���� �������� ��� ������������
	 * ������.
	 */
	private Date datePublished;
	/**
	 * dateModified: �����, Date
	 * 
	 * OpenContracting Description: ����, ���� �������� ��� ������� �������.
	 */
	private Date dateModified;
	/**
	 * language: �����
	 * 
	 * OpenContracting Description: ����� ���� ���������, �������������� ���
	 * ����������� ��� ISO 639-1, ��� ���������� BCP47 language tags.
	 */
	private String language;
	/**
	 * documentOf: �����
	 * 
	 * ������ ��������:
	 * 
	 * tender item lot
	 */
	private String documentOf;
	/**
	 * relatedItem: �����
	 * 
	 * ID ��������� Lot ��� Item.
	 */
	private String relatedItem;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
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

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDocumentOf() {
		return documentOf;
	}

	public void setDocumentOf(String documentOf) {
		this.documentOf = documentOf;
	}

	public String getRelatedItem() {
		return relatedItem;
	}

	public void setRelatedItem(String relatedItem) {
		this.relatedItem = relatedItem;
	}

}
