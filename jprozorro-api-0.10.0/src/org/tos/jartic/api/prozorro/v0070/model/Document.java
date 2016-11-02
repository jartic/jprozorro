package org.tos.jartic.api.prozorro.v0070.model;

public class Document {
	/**
	 * id: рядок, генерується автоматично
	 */
	private String id;
	/**
	 * documentType: рядок
	 * 
	 * Можливі значення для Tender
	 * 
	 * notice - Повідомлення про закупівлю
	 * 
	 * Офіційне повідомлення, що містить деталі закупівлі. Це може бути
	 * посилання на документ, веб-сторінку, чи на офіційний бюлетень, де
	 * розміщено повідомлення. biddingDocuments - Документи закупівлі
	 * 
	 * Інформація для потенційних постачальників, що описує цілі договору
	 * (наприклад, товари та послуги, які будуть закуплені) і процес торгів.
	 * technicalSpecifications - Технічні специфікації
	 * 
	 * Детальна технічна інформація про товари або послуги, що повинні бути
	 * надані. evaluationCriteria - Критерії оцінки
	 * 
	 * Інформація про те, як будуть оцінюватись пропозиції. clarifications -
	 * Пояснення до питань заданих учасниками
	 * 
	 * Включає відповіді на питання, підняті на передтендерних конференціях.
	 * eligibilityCriteria - Критерії прийнятності
	 * 
	 * Докладні документи про критерії відбору. shortlistedFirms - Фірми у
	 * короткому списку riskProvisions - Положення для управління ризиками та
	 * зобов’язаннями billOfQuantity - Кошторис bidders - Інформація про
	 * учасників
	 * 
	 * Інформація про учасників, їхні документи для перевірки та будь-які
	 * процесуальні пільги, на які вони можуть претендувати. conflictOfInterest
	 * - Виявлені конфлікти інтересів debarments - Відмова у допуску до
	 * закупівлі contractProforma - Проект договору Можливі значення для Award
	 * 
	 * notice - Повідомлення про рішення
	 * 
	 * Офіційне повідомлення, що містить деталі рішення про визначення
	 * переможця. Це може бути посилання на документ, веб-сторінку, чи на
	 * офіційний бюлетень, де розміщено повідомлення. evaluationReports - Звіт
	 * про оцінку
	 * 
	 * Звіт про оцінку пропозицій і застосування критеріїв оцінки, у тому числі,
	 * обґрунтування рішення про визначення переможця. winningBid - Пропозиція,
	 * що перемогла complaints - Скарги та рішення Можливі значення для Contract
	 * 
	 * notice - Повідомлення про договір
	 * 
	 * Офіційне повідомлення, що містить деталі підписання договору та початку
	 * його реалізації. Це може бути посилання на документ, веб-сторінку, чи на
	 * офіційний бюлетень, де розміщено повідомлення. contractSigned -
	 * Підписаний договір contractArrangements - Заходи для припинення договору
	 * contractSchedule - Розклад та етапи contractAnnexe - Додатки до договору
	 * contractGuarantees - Забезпечення тендерних пропозицій subContract -
	 * Субпідряд Можливі значення для Bid
	 * 
	 * commercialProposal - Цінова пропозиція qualificationDocuments -
	 * Документи, що підтверджують кваліфікацію eligibilityDocuments -
	 * Документи, що підтверджують відповідність (в тому числі, відповідність
	 * вимогам ст. 17)
	 */
	private String documentType;
	/**
	 * title: рядок, багатомовний
	 * 
	 * OpenContracting Description: Назва документа.
	 */
	private String title;
	/**
	 * description: рядок, багатомовний
	 * 
	 * OpenContracting Description: Короткий опис документа. Якщо документ не
	 * буде доступний онлайн, то поле опису можна використати для вказання
	 * способу отримання копії документа.
	 */
	private String description;
	/**
	 * format: рядок
	 * 
	 * OpenContracting Description: Формат документа зі списку кодів IANA Media
	 * Types, з одним додатковим значенням ‘offline/print’, що буде
	 * використовуватись, коли запис цього документа використовується для опису
	 * офлайнової публікації документа.
	 */
	private String format;
	/**
	 * url: рядок, генерується автоматично
	 * 
	 * OpenContracting Description: Пряме посилання на документ чи додаток.
	 */
	private String url;
	/**
	 * datePublished: рядок, Date
	 * 
	 * OpenContracting Description: Дата, коли документ був опублікований
	 * вперше.
	 */
	private Date datePublished;
	/**
	 * dateModified: рядок, Date
	 * 
	 * OpenContracting Description: Дата, коли документ був змінений востаннє.
	 */
	private Date dateModified;
	/**
	 * language: рядок
	 * 
	 * OpenContracting Description: Вказує мову документа, використовуючи або
	 * двоцифровий код ISO 639-1, або розширений BCP47 language tags.
	 */
	private String language;
	/**
	 * documentOf: рядок
	 * 
	 * Можливі значення:
	 * 
	 * tender item lot
	 */
	private String documentOf;
	/**
	 * relatedItem: рядок
	 * 
	 * ID пов’язаних Lot або Item.
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
