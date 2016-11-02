package org.tos.jartic.api.prozorro.v0070.model;

public class Lot {
	/**
	 * id: �����, ���������� �����������
	 */
	private String id;
	/**
	 * title: �����, ������������
	 * 
	 * ����� ���� �������.
	 */
	private String title;
	/**
	 * description: �����, ������������
	 * 
	 * ��������� ���� ���� �������.
	 */
	private String description;
	/**
	 * value: Value, ����������
	 * 
	 * ������ ��������� ������ ���� �������. ֳ��� ����������, ����� ��
	 * value, ������ �������.
	 */
	private Value value;
	/**
	 * guarantee: Guarantee
	 * 
	 * ������������ �������� ����������
	 */
	private Guarantee guarantee;
	/**
	 * date: �����, Date, ���������� �����������
	 */
	private Date date;
	/**
	 * minimalStep: Value, ����������
	 * 
	 * ̳�������� ���� �������� (����������). ������� ��������:
	 * 
	 * amount ������� ���� ������, �� Lot.value.amount currency ������� ���
	 * ���� �������, ��� ��������� Lot.value.currency valueAddedTaxIncluded
	 * ������� ��� ���� �������, ��� ���������
	 * Lot.value.valueAddedTaxIncluded
	 */
	private Value minimalStep;
	/**
	 * auctionPeriod: Period, �������� ���� ��� �������
	 * 
	 * ����� ���������� ��������.
	 */
	private Period auctionPeriod;
	/**
	 * auctionUrl: URL-������
	 * 
	 * ���-������ ��� ��������� ��������.
	 */
	private String auctionUrl;
	/**
	 * status: �����
	 * 
	 * active: �������� ��� ������� (��������) unsuccessful: ��������� ���
	 * ������� (�� �������) complete: ��������� ��� ������� (���������)
	 * cancelled: ��������� ��� ������� (���������) ������ ����.
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
