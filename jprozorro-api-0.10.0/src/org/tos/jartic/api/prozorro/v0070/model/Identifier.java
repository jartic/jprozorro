package org.tos.jartic.api.prozorro.v0070.model;

public class Identifier {
	/**
	 * scheme: рядок
	 * 
	 * OpenContracting Description: Ідентифікатори організації беруться з
	 * існуючої схеми ідентифікації. Це поле вказує схему або список кодів, де
	 * можна знайти ідентифікатор організації. Це значення повинно братись зі
	 * Схеми Ідентифікації Організацій.
	 */
	private String scheme;
	/**
	 * id: рядок, обов’язковий
	 * 
	 * OpenContracting Description: Ідентифікатор організації у вибраній схемі.
	 * 
	 * Дозволеними є коди зі спику кодів “Organisation Registration Agency”
	 * Стандарту IATI з додаванням коду UA-EDR для організацій, зареєстрованих в
	 * Україні (ЄДРПОУ та ІПН).
	 */
	private String id;
	/**
	 * legalName: рядок, багатомовний
	 * 
	 * OpenContracting Description: Легально зареєстрована назва організації.
	 */
	private String legalName;
	/**
	 * uri: uri
	 * 
	 * OpenContracting Description: URI для ідентифікації організації,
	 * наприклад, ті, які надають Open Corporates або інші постачальники URI. Це
	 * не для вебсайту організації, його можна надати в полі url в ContactPoint
	 * організації.
	 */
	private String uri;

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}
