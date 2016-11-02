package org.tos.jartic.api.prozorro.v0070.model;

public class Value {
	/**
	 * amount: float, ����������
	 * 
	 * OpenContracting Description: ʳ������ �� �����.
	 * 
	 * ������� ���� �������.
	 */
	private float amount;
	/**
	 * currency: �����, �����������
	 * 
	 * OpenContracting Description: ������ � ������������� ������ ISO 4217.
	 */
	private String currency;
	/**
	 * valueAddedTaxIncluded:
	 * 
	 * bool, ����������
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
