package org.tos.jartic.api.prozorro.v0070.model;

public class ContactPoint {
	/**
	 * name: рядок, багатомовний, обов’язковий
	 * 
	 * OpenContracting Description: Ім’я контактної особи, назва відділу чи
	 * контактного пункту для листування, що стосується цього процесу укладання
	 * договору.
	 */
	private String name;
	/**
	 * email: email
	 * 
	 * OpenContracting Description: Адреса електронної пошти контактної
	 * особи/пункту.
	 */
	private String email;
	/**
	 * telephone: рядок
	 * 
	 * OpenContracting Description: Номер телефону контактної особи/пункту.
	 * Повинен включати міжнародний телефонний код.
	 */
	private String telephone;
	/**
	 * faxNumber: рядок
	 * 
	 * OpenContracting Description: Номер факсу контактної особи/пункту. Повинен
	 * включати міжнародний телефонний код.
	 */
	private String faxNumber;
	/**
	 * url: url
	 * 
	 * OpenContracting Description: Веб адреса контактної особи/пункту.
	 */
	private String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
