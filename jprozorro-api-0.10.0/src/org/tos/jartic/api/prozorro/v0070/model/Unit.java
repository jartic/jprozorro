package org.tos.jartic.api.prozorro.v0070.model;

public class Unit {
	/**
	 * code: рядок, обов’язковий
	 * 
	 * Код одиниці в UN/CEFACT Recommendation 20.
	 */
	private String code;
	/**
	 * name: рядок
	 * 
	 * OpenContracting Description: Назва одиниці
	 */
	private String name;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
