package org.tos.jartic.api.prozorro.v0070.model;

public class Guarantee {
	/**
	 * amount: float, ����������
	 * 
	 * OpenContracting Description: ʳ������ �� �����.
	 * 
	 * ������� ���� �������.
	 */
	private float amount;
	/**
	 * currency: �����, �����������, �� ������������� = UAH
	 * 
	 * OpenContracting Description: ������ � ������������� ������ ISO 4217.
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
