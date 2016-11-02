package org.tos.jartic.api.prozorro.v0070.model;

public class Guarantee {
	/**
	 * amount: float, обов’язково
	 * 
	 * OpenContracting Description: Кількість як число.
	 * 
	 * Повинно бути додатнім.
	 */
	private float amount;
	/**
	 * currency: рядок, обов’язковий, за замовчуванням = UAH
	 * 
	 * OpenContracting Description: Валюта у трибуквенному форматі ISO 4217.
	 */
	private String currency;

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

}
