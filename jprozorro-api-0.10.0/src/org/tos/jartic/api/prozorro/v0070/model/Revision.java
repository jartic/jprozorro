package org.tos.jartic.api.prozorro.v0070.model;

import java.util.ArrayList;

public class Revision {
	/**
	 * date: �����, Date
	 * 
	 * ����, ���� ���� ���� �������.
	 */
	private Date date;
	/**
	 * changes: ������ �ᒺ��� Change
	 */
	private ArrayList<Change> changes = new ArrayList<>();

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ArrayList<Change> getChanges() {
		return changes;
	}

	public void setChanges(ArrayList<Change> changes) {
		this.changes = changes;
	}

}
