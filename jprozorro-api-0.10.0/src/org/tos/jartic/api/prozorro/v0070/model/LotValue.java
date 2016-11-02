package org.tos.jartic.api.prozorro.v0070.model;

public class LotValue {
	/**
	 * value: Value, ����������
	 * 
	 * ������� ��������:
	 * 
	 * amount ������� ���� ������, �� Lot.value.amount currency ������� ���
	 * ���� �������, ��� ��������� Lot.value.currency valueAddedTaxIncluded
	 * ������� ��� ���� �������, ��� ���������
	 * Lot.value.valueAddedTaxIncluded
	 */
	private Value value;
	/**
	 * relatedLot: �����
	 * 
	 * ID ���������� Lot.
	 */
	private String relatedLot;
	/**
	 * date: �����, Date, ���������� �����������
	 */
	private Date date;
	/**
	 * participationUrl:
	 * 
	 * URL-������
	 * 
	 * ���-������ ��� ����� � �������.
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
