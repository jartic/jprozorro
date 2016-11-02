package org.tos.jartic.api.prozorro.v0070.model;

public class Lot {
	/**
	 * id: рядок, генерується автоматично
	 */
	private String id;
	/**
	 * title: рядок, багатомовний
	 * 
	 * Назва лота закупівлі.
	 */
	private String title;
	/**
	 * description: рядок, багатомовний
	 * 
	 * Детальний опис лота закупівлі.
	 */
	private String description;
	/**
	 * value: Value, обов’язково
	 * 
	 * Повний доступний бюджет лота закупівлі. Цінові пропозиції, більші ніж
	 * value, будуть відхилені.
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
	 * minimalStep: Value, обов’язково
	 * 
	 * Мінімальний крок аукціону (редукціону). Правила валідації:
	 * 
	 * amount повинно бути меншим, ніж Lot.value.amount currency повинно або
	 * бути відсутнім, або відповідати Lot.value.currency valueAddedTaxIncluded
	 * повинно або бути відсутнім, або відповідати
	 * Lot.value.valueAddedTaxIncluded
	 */
	private Value minimalStep;
	/**
	 * auctionPeriod: Period, доступно лише для читання
	 * 
	 * Період проведення аукціону.
	 */
	private Period auctionPeriod;
	/**
	 * auctionUrl: URL-адреса
	 * 
	 * Веб-адреса для перегляду аукціону.
	 */
	private String auctionUrl;
	/**
	 * status: рядок
	 * 
	 * active: Активний лот закупівлі (активний) unsuccessful: Неуспішний лот
	 * закупівлі (не відбувся) complete: Завершено лот закупівлі (завершено)
	 * cancelled: Скасовано лот закупівлі (скасовано) Статус лота.
	 */
	private String status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Value getMinimalStep() {
		return minimalStep;
	}

	public void setMinimalStep(Value minimalStep) {
		this.minimalStep = minimalStep;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
