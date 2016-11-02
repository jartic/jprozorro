package org.tos.jartic.api.prozorro.v0070.model;

public class Parameter {
	/**
	 * code: рядок, обов’язковий
	 * 
	 * Код критерію.
	 */
	private String code;
	/**
	 * value: float, обов’язково
	 * 
	 * Значення критерію.
	 */
	private float value;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

}
