package org.tos.jartic.api.prozorro.v0070.model;

import java.util.ArrayList;

public class Complaint {
	/**
	 * id: uid, ���������� �����������
	 */
	private String id;
	/**
	 * author: Organization, ����������
	 * 
	 * ����������, ��� ���� ������ (contactPoint - ������, identification -
	 * ����������, ��� �� ������ �����������).
	 */
	private Organization author;
	/**
	 * title: �����, �����������
	 * 
	 * ��������� ������.
	 */
	private String title;
	/**
	 * description: ���� ���������.
	 */
	private String description;
	/**
	 * date: �����, Date, ���������� �����������
	 * 
	 * ���� �������.
	 */
	private Date date;
	/**
	 * dateSubmitted: �����, Date, ���������� �����������
	 * 
	 * ����, ���� ������ ���� ������.
	 */
	private Date dateSubmitted;
	/**
	 * dateAnswered: �����, Date, ���������� �����������
	 * 
	 * ����, ���� �������� ������ �� ������.
	 */
	private Date dateAnswered;
	/**
	 * dateEscalated: �����, Date, ���������� �����������
	 * 
	 * ���� ��������� (������������ ������ �� ������).
	 */
	private Date dateEscalated;
	/**
	 * dateDecision: �����, Date, ���������� �����������
	 * 
	 * ���� ��������� ������ �� �����.
	 */
	private Date dateDecision;
	/**
	 * dateCanceled: �����, Date, ���������� �����������
	 * 
	 * ���� ���������.
	 */
	private Date dateCanceled;
	/**
	 * status: �����
	 * 
	 * ������ ��������:
	 * 
	 * draft - ��������, ���������� ���� claim - ������ answered - ����
	 * ������� pending - �� �������, �� ������������ invalid - �������
	 * declined - �������� resolved - ������� cancelled - ��������
	 */
	private String status;
	/**
	 * type: �����
	 * 
	 * ������ �������� ����:
	 * 
	 * claim - ������ complaint - ������
	 */
	private String type;
	/**
	 * resolution: �����
	 * 
	 * г����� ���������.
	 */
	private String resolution;
	/**
	 * resolutionType: �����
	 * 
	 * ������ �������� ���� ��������:
	 * 
	 * invalid - ������� declined - �������� resolved - �������
	 */
	private String resolutionType;
	/**
	 * satisfied: ������ ��������
	 * 
	 * ������ �����������?
	 */
	private boolean satisfied;
	/**
	 * decision: �����
	 * 
	 * г����� ������ ����������.
	 */
	private String decision;
	/**
	 * cancellationReason:
	 * 
	 * �����
	 * 
	 * ������� ���������.
	 */
	private String cancellationReason;
	/**
	 * documents: ������ �ᒺ��� Document
	 */
	private ArrayList<Document> documents = new ArrayList<>();
	/**
	 * relatedLot: �����
	 * 
	 * ������������� ���������� Lot-�.
	 */
	private String relatedLot;
	/**
	 * tendererAction: �����
	 * 
	 * ĳ� ��������.
	 */
	private String tendererAction;
	/**
	 * tendererActionDate:
	 * 
	 * �����, Date, ���������� �����������
	 * 
	 * ���� 䳿 ��������.
	 */
	private Date tendererActionDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Organization getAuthor() {
		return author;
	}

	public void setAuthor(Organization author) {
		this.author = author;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDateSubmitted() {
		return dateSubmitted;
	}

	public void setDateSubmitted(Date dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}

	public Date getDateAnswered() {
		return dateAnswered;
	}

	public void setDateAnswered(Date dateAnswered) {
		this.dateAnswered = dateAnswered;
	}

	public Date getDateEscalated() {
		return dateEscalated;
	}

	public void setDateEscalated(Date dateEscalated) {
		this.dateEscalated = dateEscalated;
	}

	public Date getDateDecision() {
		return dateDecision;
	}

	public void setDateDecision(Date dateDecision) {
		this.dateDecision = dateDecision;
	}

	public Date getDateCanceled() {
		return dateCanceled;
	}

	public void setDateCanceled(Date dateCanceled) {
		this.dateCanceled = dateCanceled;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getResolutionType() {
		return resolutionType;
	}

	public void setResolutionType(String resolutionType) {
		this.resolutionType = resolutionType;
	}

	public boolean isSatisfied() {
		return satisfied;
	}

	public void setSatisfied(boolean satisfied) {
		this.satisfied = satisfied;
	}

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	public String getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	public ArrayList<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(ArrayList<Document> documents) {
		this.documents = documents;
	}

	public String getRelatedLot() {
		return relatedLot;
	}

	public void setRelatedLot(String relatedLot) {
		this.relatedLot = relatedLot;
	}

	public String getTendererAction() {
		return tendererAction;
	}

	public void setTendererAction(String tendererAction) {
		this.tendererAction = tendererAction;
	}

	public Date getTendererActionDate() {
		return tendererActionDate;
	}

	public void setTendererActionDate(Date tendererActionDate) {
		this.tendererActionDate = tendererActionDate;
	}

}
