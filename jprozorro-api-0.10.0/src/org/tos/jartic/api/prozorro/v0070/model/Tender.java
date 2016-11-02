package org.tos.jartic.api.prozorro.v0070.model;

import java.util.ArrayList;

public class Tender {
	/**
	 * title: �����, ������������
	 * 
	 * ����� �������, ��� ������������ � �������. ����� �������� ���
	 * ��������:
	 * 
	 * ��� ������� (� ������ ��������� ����������-���������) �����������
	 * ������� (������, ����������, � �.�.) �������, �� ������������ ����
	 * ����������
	 */
	private String title;
	/**
	 * description: �����, ������������
	 * 
	 * ��������� ���� �������
	 */
	private String description;
	/**
	 * tenderID: �����, ���������� �����������, ���� ��� �������
	 * 
	 * ������������� �������, ��� ������ �������� � ��������� ������������
	 * 
	 * OpenContracting Description: ������������� ������� TenderID �������
	 * ������ ��������� � OCID. ���� ���������, ��� ������� ��������� �����
	 * ���� �������.
	 */
	private String tenderID;
	/**
	 * procuringEntity:
	 * 
	 * ProcuringEntity, ����������
	 * 
	 * �������� (����������, �� ��������� ��������).
	 * 
	 * OpenContracting Description: �ᒺ��, �� �������� ���������. ³� ��
	 * ���������� � ��������, ���� ������� / ����������� �������� ��������.
	 */
	private ProcuringEntity procuringEntity;
	/**
	 * value: Value, ����������
	 * 
	 * ������ ��������� ������ �������. ����������, �� ����� �� value ������
	 * �������.
	 * 
	 * OpenContracting Description: �������� ���������� ������� �������.
	 */
	private Value value;
	/**
	 * guarantee: Guarantee
	 * 
	 * ������������ �������� ����������
	 */
	private Guarantee guarantee;
	/**
	 * date: �����, Date, ���������� �����������
	 */
	private Date date;
	/**
	 * items: ������ �ᒺ��� Item, ����������
	 * 
	 * ������, ���� ������ �������, �� ������������.
	 * 
	 * OpenContracting Description: ������ �� �������, �� ������ ��������,
	 * ������ �� ������� ��������, �� �� �������. �������� �� ������
	 * �����������, ������ ����� ������ ������� 2.
	 */
	private ArrayList<Item> items = new ArrayList<>();
	/**
	 * features: ������ �ᒺ��� Feature
	 * 
	 * ���������� �������.
	 */
	private ArrayList<Feature> features = new ArrayList<>();
	/**
	 * documents: ������ �ᒺ��� Document
	 * 
	 * OpenContracting Description: �� ��������� �� ������� ������� ��
	 * ���������.
	 */
	private ArrayList<Document> documents = new ArrayList<>();
	/**
	 * questions: ������ �ᒺ��� Question
	 * 
	 * ������� �� ��������� procuringEntity � ������ �� ���.
	 */
	private ArrayList<Question> questions = new ArrayList<>();
	/**
	 * complaints: ������ �ᒺ��� Complaint
	 * 
	 * ������ �� ����� ������� �� �� ��������.
	 */
	private ArrayList<Complaint> complaints = new ArrayList<>();
	/**
	 * bids: ������ �ᒺ��� Bid
	 * 
	 * ������ ��� ���������� ��������� �� ��� ������� ����� �� �����������
	 * ��� �������� �������, ��� ���������� �� ���� �������������
	 * ������������.
	 * 
	 * OpenContracting Description: ������ ��� �������, �� ������ ������ ���
	 * ����� � �������.
	 */
	private ArrayList<Bid> bids = new ArrayList<>();
	/**
	 * minimalStep: Value, ����������
	 * 
	 * ̳�������� ���� �������� (����������). ������� ��������:
	 * 
	 * �������� amount ������� ���� ������ �� Tender.value.amount ��������
	 * currency ������� ���� ��� �������, ��� ��������� �
	 * Tender.value.currency �������� valueAddedTaxIncluded ������� ���� ���
	 * �������, ��� ��������� � Tender.value.valueAddedTaxIncluded
	 */
	private Value minimalStep;
	/**
	 * awards: ������ �ᒺ��� Award
	 * 
	 * �� ����������� (�������������� �� ���������).
	 */
	private ArrayList<Award> awards = new ArrayList<>();
	/**
	 * ������ �ᒺ��� Contract
	 */
	private ArrayList<Contract> contracts = new ArrayList<>();
	/**
	 * enquiryPeriod: Period, ����������
	 * 
	 * �����, ���� ��������� �������� �������. ������� ���� ������� ���� �
	 * endDate ����.
	 * 
	 * OpenContracting Description: �����, ���� ����� ������� ��������� ��
	 * �������� ������ �� ���.
	 */
	private Period enquiryPeriod;
	/**
	 * tenderPeriod: Period, ����������
	 * 
	 * �����, ���� ��������� ����������. ������� ���� ������� ���� � endDate
	 * ����.
	 * 
	 * OpenContracting Description: �����, ���� �������� ������� ��� ������
	 * ����������. ʳ����� ���� - �� ����, ���� ���������� ����������
	 * ����������.
	 */
	private Period tenderPeriod;
	/**
	 * auctionPeriod: Period, ���� ��� �������
	 * 
	 * �����, ���� ����������� �������.
	 */
	private Period auctionPeriod;
	/**
	 * auctionUrl: URL-������
	 * 
	 * ���-������ ��� ��������� ��������.
	 */
	private String auctionUrl;
	/**
	 * awardPeriod: Period, ���� ��� �������
	 * 
	 * �����, ���� ���������� ���������� ���������.
	 * 
	 * OpenContracting Description: ���� ��� �����, ���� ��������� ����������
	 * ���������.
	 */
	private Period awardPeriod;
	/**
	 * status: �����
	 * 
	 * active.enquiries:
	 * 
	 * ����� �������� (���������) active.tendering:
	 * 
	 * ���������� ���������� (����������) active.auction: ����� ��������
	 * (�������) active.qualification:
	 * 
	 * ����������� ��������� (�����������) active.awarded: ����������
	 * ���������� (����������) unsuccessful: �������� �� �������� (��
	 * ��������) complete: ��������� �������� (���������) cancelled: ³������
	 * �������� (�������) ������ �������.
	 */
	private String status;
	/**
	 * ������ �ᒺ��� Lot.
	 * 
	 * ̳����� �� ���� �������.
	 */
	private ArrayList<Lot> lots = new ArrayList<>();
	/**
	 * ������ �ᒺ��� Cancellation.
	 * 
	 * ̳����� 1 �ᒺ�� � �������� active �� �������, ���� �������� ����
	 * �������.
	 * 
	 * �ᒺ�� Cancellation ����� ������� ���������� ������� �� ����
	 * ������� ���������, ���� ��� �.
	 */
	private ArrayList<Cancellation> cancellations = new ArrayList<>();
	/**
	 * ������ �ᒺ��� Revision, ���������� �����������, ���� ��� �������
	 * 
	 * ���� ������������ �ᒺ��� �������
	 */
	private ArrayList<Revision> revisions = new ArrayList<>();

	/**
	 * 
	 */
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

	public String getTenderID() {
		return tenderID;
	}

	public void setTenderID(String tenderID) {
		this.tenderID = tenderID;
	}

	public ProcuringEntity getProcuringEntity() {
		return procuringEntity;
	}

	public void setProcuringEntity(ProcuringEntity procuringEntity) {
		this.procuringEntity = procuringEntity;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public Guarantee getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(Guarantee guarantee) {
		this.guarantee = guarantee;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public ArrayList<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(ArrayList<Feature> features) {
		this.features = features;
	}

	public ArrayList<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(ArrayList<Document> documents) {
		this.documents = documents;
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}

	public ArrayList<Complaint> getComplaints() {
		return complaints;
	}

	public void setComplaints(ArrayList<Complaint> complaints) {
		this.complaints = complaints;
	}

	public ArrayList<Bid> getBids() {
		return bids;
	}

	public void setBids(ArrayList<Bid> bids) {
		this.bids = bids;
	}

	public Value getMinimalStep() {
		return minimalStep;
	}

	public void setMinimalStep(Value minimalStep) {
		this.minimalStep = minimalStep;
	}

	public ArrayList<Award> getAwards() {
		return awards;
	}

	public void setAwards(ArrayList<Award> awards) {
		this.awards = awards;
	}

	public ArrayList<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(ArrayList<Contract> contracts) {
		this.contracts = contracts;
	}

	public Period getEnquiryPeriod() {
		return enquiryPeriod;
	}

	public void setEnquiryPeriod(Period enquiryPeriod) {
		this.enquiryPeriod = enquiryPeriod;
	}

	public Period getTenderPeriod() {
		return tenderPeriod;
	}

	public void setTenderPeriod(Period tenderPeriod) {
		this.tenderPeriod = tenderPeriod;
	}

	public Period getAuctionPeriod() {
		return auctionPeriod;
	}

	public void setAuctionPeriod(Period auctionPeriod) {
		this.auctionPeriod = auctionPeriod;
	}

	public String getAuctionUrl() {
		return auctionUrl;
	}

	public void setAuctionUrl(String auctionUrl) {
		this.auctionUrl = auctionUrl;
	}

	public Period getAwardPeriod() {
		return awardPeriod;
	}

	public void setAwardPeriod(Period awardPeriod) {
		this.awardPeriod = awardPeriod;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ArrayList<Lot> getLots() {
		return lots;
	}

	public void setLots(ArrayList<Lot> lots) {
		this.lots = lots;
	}

	public ArrayList<Cancellation> getCancellations() {
		return cancellations;
	}

	public void setCancellations(ArrayList<Cancellation> cancellations) {
		this.cancellations = cancellations;
	}

	public ArrayList<Revision> getRevisions() {
		return revisions;
	}

	public void setRevisions(ArrayList<Revision> revisions) {
		this.revisions = revisions;
	}

}
