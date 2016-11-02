package org.tos.jartic.api.prozorro.v0070.model;

public class Enum {
	/**
	 * value: float, обов’язково
	 */
	private float value;
	/**
	 * title: рядок, багатомовний, обов’язковий
	 */
	private String title;
	/**
	 * description: рядок, багатомовний
	 */
	private String description;

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
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

}
