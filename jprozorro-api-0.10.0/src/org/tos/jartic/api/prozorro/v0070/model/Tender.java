package org.tos.jartic.api.prozorro.v0070.model;

import java.util.ArrayList;

public class Tender {
	/**
	 * title: рядок, багатомовний
	 * 
	 * Назва тендера, яка відображається у списках. Можна включити такі
	 * елементи:
	 * 
	 * код закупівлі (у системі управління організації-замовника) періодичність
	 * закупівлі (щороку, щокварталу, і т.д.) елемент, що закуповується інша
	 * інформація
	 */
	private String title;
	/**
	 * description: рядок, багатомовний
	 * 
	 * Детальний опис закупівлі
	 */
	private String description;
	/**
	 * tenderID: рядок, генерується автоматично, лише для читання
	 * 
	 * Ідентифікатор закупівлі, щоб знайти закупівлю у “паперовій” документації
	 * 
	 * OpenContracting Description: Ідентифікатор тендера TenderID повинен
	 * завжди співпадати з OCID. Його включають, щоб зробити структуру даних
	 * більш зручною.
	 */
	private String tenderID;
	/**
	 * procuringEntity:
	 * 
	 * ProcuringEntity, обов’язково
	 * 
	 * Замовник (організація, що проводить закупівлю).
	 * 
	 * OpenContracting Description: Об’єкт, що управляє закупівлею. Він не
	 * обов’язково є покупцем, який платить / використовує закуплені елементи.
	 */
	private ProcuringEntity procuringEntity;
	/**
	 * value: Value, обов’язково
	 * 
	 * Повний доступний бюджет закупівлі. Пропозиції, що більші за value будуть
	 * відхилені.
	 * 
	 * OpenContracting Description: Загальна кошторисна вартість закупівлі.
	 */
	private Value value;
	/**
	 * guarantee: Guarantee
	 * 
	 * Забезпечення тендерної пропозиції
	 */
	private Guarantee guarantee;
	/**
	 * date: рядок, Date, генерується автоматично
	 */
	private Date date;
	/**
	 * items: список об’єктів Item, обов’язково
	 * 
	 * Список, який містить елемент, що закуповується.
	 * 
	 * OpenContracting Description: Товари та послуги, що будуть закуплені,
	 * поділені на спискові елементи, де це можливо. Елементи не повинні
	 * дублюватись, замість цього вкажіть кількість 2.
	 */
	private ArrayList<Item> items = new ArrayList<>();
	/**
	 * features: список об’єктів Feature
	 * 
	 * Властивості закупівлі.
	 */
	private ArrayList<Feature> features = new ArrayList<>();
	/**
	 * documents: Список об’єктів Document
	 * 
	 * OpenContracting Description: Всі документи та додатки пов’язані із
	 * закупівлею.
	 */
	private ArrayList<Document> documents = new ArrayList<>();
	/**
	 * questions: Список об’єктів Question
	 * 
	 * Питання до замовника procuringEntity і відповіді на них.
	 */
	private ArrayList<Question> questions = new ArrayList<>();
	/**
	 * complaints: Список об’єктів Complaint
	 * 
	 * Скарги на умови закупівлі та їх вирішення.
	 */
	private ArrayList<Complaint> complaints = new ArrayList<>();
	/**
	 * bids: Список об’єктів Bid
	 * 
	 * Список усіх пропозицій зроблених під час закупівлі разом із інформацією
	 * про учасників закупівлі, їхні пропозиції та інша кваліфікаційна
	 * документація.
	 * 
	 * OpenContracting Description: Список усіх компаній, які подали заявки для
	 * участі у закупівлі.
	 */
	private ArrayList<Bid> bids = new ArrayList<>();
	/**
	 * minimalStep: Value, обов’язково
	 * 
	 * Мінімальний крок аукціону (редукціону). Правила валідації:
	 * 
	 * Значення amount повинно бути меншим за Tender.value.amount Значення
	 * currency повинно бути або відсутнім, або співпадати з
	 * Tender.value.currency Значення valueAddedTaxIncluded повинно бути або
	 * відсутнім, або співпадати з Tender.value.valueAddedTaxIncluded
	 */
	private Value minimalStep;
	/**
	 * awards: Список об’єктів Award
	 * 
	 * Усі кваліфікації (дискваліфікації та переможці).
	 */
	private ArrayList<Award> awards = new ArrayList<>();
	/**
	 * Список об’єктів Contract
	 */
	private ArrayList<Contract> contracts = new ArrayList<>();
	/**
	 * enquiryPeriod: Period, обов’язково
	 * 
	 * Період, коли дозволено задавати питання. Повинна бути вказана хоча б
	 * endDate дата.
	 * 
	 * OpenContracting Description: Період, коли можна зробити уточнення та
	 * отримати відповіді на них.
	 */
	private Period enquiryPeriod;
	/**
	 * tenderPeriod: Period, обов’язково
	 * 
	 * Період, коли подаються пропозиції. Повинна бути вказана хоча б endDate
	 * дата.
	 * 
	 * OpenContracting Description: Період, коли закупівля відкрита для подачі
	 * пропозицій. Кінцева дата - це дата, коли перестають прийматись
	 * пропозиції.
	 */
	private Period tenderPeriod;
	/**
	 * auctionPeriod: Period, лише для читання
	 * 
	 * Період, коли проводиться аукціон.
	 */
	private Period auctionPeriod;
	/**
	 * auctionUrl: URL-адреса
	 * 
	 * Веб-адреса для перегляду аукціону.
	 */
	private String auctionUrl;
	/**
	 * awardPeriod: Period, лише для читання
	 * 
	 * Період, коли відбувається визначення переможця.
	 * 
	 * OpenContracting Description: Дата або період, коли очікується визначення
	 * переможця.
	 */
	private Period awardPeriod;
	/**
	 * status: рядок
	 * 
	 * active.enquiries:
	 * 
	 * Період уточнень (уточнення) active.tendering:
	 * 
	 * Очікування пропозицій (пропозиції) active.auction: Період аукціону
	 * (аукціон) active.qualification:
	 * 
	 * Кваліфікація переможця (кваліфікація) active.awarded: Пропозиції
	 * розглянуто (розглянуто) unsuccessful: Закупівля не відбулась (не
	 * відбулась) complete: Завершена закупівля (завершена) cancelled: Відмінена
	 * закупівля (відмінена) Статус Закупівлі.
	 */
	private String status;
	/**
	 * Список об’єктів Lot.
	 * 
	 * Містить всі лоти закупівлі.
	 */
	private ArrayList<Lot> lots = new ArrayList<>();
	/**
	 * Список об’єктів Cancellation.
	 * 
	 * Містить 1 об’єкт зі статусом active на випадок, якщо закупівлю буде
	 * відмінено.
	 * 
	 * Об’єкт Cancellation описує причину скасування закупівлі та надає
	 * відповідні документи, якщо такі є.
	 */
	private ArrayList<Cancellation> cancellations = new ArrayList<>();
	/**
	 * Список об’єктів Revision, генерується автоматично, лише для читання
	 * 
	 * Зміни властивостей об’єктів Закупівлі
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
