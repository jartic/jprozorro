package org.tos.jartic.api.prozorro.v0070.model;

public class Value {
	/**
	 * amount: float, обов’язково
	 * 
	 * OpenContracting Description: Кількість як число.
	 * 
	 * Повинно бути додатнім.
	 */
	private float amount;
	/**
	 * currency: рядок, обов’язковий
	 * 
	 * OpenContracting Description: Валюта у трибуквенному форматі ISO 4217.
	 */
	private String currency;
	/**
	 * valueAddedTaxIncluded:
	 * 
	 * bool, обов’язково
	 */
	private boolean valueAddedTaxIncluded;

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public boolean isValueAddedTaxIncluded() {
		return valueAddedTaxIncluded;
	}

	public void setValueAddedTaxIncluded(boolean valueAddedTaxIncluded) {
		this.valueAddedTaxIncluded = valueAddedTaxIncluded;
	}

}
