package org.tos.jartic.api.prozorro.v0070.model;

public class Period {
	/**
	 * startDate: �����, Date
	 * 
	 * OpenContracting Description: ��������� ���� ������.
	 */
	private Date startDate;
	/**
	 * endDate: �����, Date
	 * 
	 * OpenContracting Description: ʳ����� ���� ������.
	 */
	private Date endDate;

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
