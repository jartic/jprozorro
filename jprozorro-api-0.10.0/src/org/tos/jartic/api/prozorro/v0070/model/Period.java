package org.tos.jartic.api.prozorro.v0070.model;

public class Period {
	/**
	 * startDate: рядок, Date
	 * 
	 * OpenContracting Description: Початкова дата періоду.
	 */
	private Date startDate;
	/**
	 * endDate: рядок, Date
	 * 
	 * OpenContracting Description: Кінцева дата періоду.
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
