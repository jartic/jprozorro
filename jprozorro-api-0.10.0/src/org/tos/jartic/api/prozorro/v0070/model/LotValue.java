package org.tos.jartic.api.prozorro.v0070.model;

public class LotValue {
	/**
	 * value: Value, обов’язково
	 * 
	 * Правила валідації:
	 * 
	 * amount повинно бути меншим, ніж Lot.value.amount currency повинно або
	 * бути відсутнім, або відповідати Lot.value.currency valueAddedTaxIncluded
	 * повинно або бути відсутнім, або відповідати
	 * Lot.value.valueAddedTaxIncluded
	 */
	private Value value;
	/**
	 * relatedLot: рядок
	 * 
	 * ID пов’язаного Lot.
	 */
	private String relatedLot;
	/**
	 * date: рядок, Date, генерується автоматично
	 */
	private Date date;
	/**
	 * participationUrl:
	 * 
	 * URL-адреса
	 * 
	 * Веб-адреса для участі в аукціоні.
	 */
	private String participationUrl;

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public String getRelatedLot() {
		return relatedLot;
	}

	public void setRelatedLot(String relatedLot) {
		this.relatedLot = relatedLot;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getParticipationUrl() {
		return participationUrl;
	}

	public void setParticipationUrl(String participationUrl) {
		this.participationUrl = participationUrl;
	}

}
