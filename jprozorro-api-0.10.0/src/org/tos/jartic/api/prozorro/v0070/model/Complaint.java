package org.tos.jartic.api.prozorro.v0070.model;

import java.util.ArrayList;

public class Complaint {
	/**
	 * id: uid, генерується автоматично
	 */
	private String id;
	/**
	 * author: Organization, обов’язково
	 * 
	 * Організація, яка подає скаргу (contactPoint - людина, identification -
	 * організація, яку ця людина представляє).
	 */
	private Organization author;
	/**
	 * title: рядок, обов’язковий
	 * 
	 * Заголовок скарги.
	 */
	private String title;
	/**
	 * description: Опис запитання.
	 */
	private String description;
	/**
	 * date: рядок, Date, генерується автоматично
	 * 
	 * Дата подання.
	 */
	private Date date;
	/**
	 * dateSubmitted: рядок, Date, генерується автоматично
	 * 
	 * Дата, коли вимога була подана.
	 */
	private Date dateSubmitted;
	/**
	 * dateAnswered: рядок, Date, генерується автоматично
	 * 
	 * Дата, коли замовник відповів на вимогу.
	 */
	private Date dateAnswered;
	/**
	 * dateEscalated: рядок, Date, генерується автоматично
	 * 
	 * Дата ескалації (перетворення вимоги на скаргу).
	 */
	private Date dateEscalated;
	/**
	 * dateDecision: рядок, Date, генерується автоматично
	 * 
	 * День прийняття рішення по вимозі.
	 */
	private Date dateDecision;
	/**
	 * dateCanceled: рядок, Date, генерується автоматично
	 * 
	 * Дата відхилення.
	 */
	private Date dateCanceled;
	/**
	 * status: рядок
	 * 
	 * Можливі значення:
	 * 
	 * draft - чорновик, початковий етап claim - вимога answered - дано
	 * відповідь pending - не вирішено, ще обробляється invalid - недійсно
	 * declined - відхилено resolved - вирішено cancelled - відхилено
	 */
	private String status;
	/**
	 * type: рядок
	 * 
	 * Можливі значення типу:
	 * 
	 * claim - вимога complaint - скарга
	 */
	private String type;
	/**
	 * resolution: рядок
	 * 
	 * Рішення замовника.
	 */
	private String resolution;
	/**
	 * resolutionType: рядок
	 * 
	 * Можливі значення типу вирішення:
	 * 
	 * invalid - недійсно declined - відхилено resolved - вирішено
	 */
	private String resolutionType;
	/**
	 * satisfied: булеве значення
	 * 
	 * Вимога задовільнена?
	 */
	private boolean satisfied;
	/**
	 * decision: рядок
	 * 
	 * Рішення органу оскарження.
	 */
	private String decision;
	/**
	 * cancellationReason:
	 * 
	 * рядок
	 * 
	 * Причини відхилення.
	 */
	private String cancellationReason;
	/**
	 * documents: Список об’єктів Document
	 */
	private ArrayList<Document> documents = new ArrayList<>();
	/**
	 * relatedLot: рядок
	 * 
	 * Ідентифікатор пов’язаного Lot-а.
	 */
	private String relatedLot;
	/**
	 * tendererAction: рядок
	 * 
	 * Дія учасника.
	 */
	private String tendererAction;
	/**
	 * tendererActionDate:
	 * 
	 * рядок, Date, генерується автоматично
	 * 
	 * Дата дії учасника.
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
