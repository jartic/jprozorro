package org.tos.jartic.api.prozorro.v0070.model;

public class Classification {
	/**
	 * scheme: рядок
	 * 
	 * OpenContracting Description: Класифікація повинна бути взята з існуючої
	 * схеми або списку кодів. Це поле використовується, щоб вказати
	 * схему/список кодів, з яких буде братись класифікація. Для класифікацій
	 * лінійних елементів це значення повинно представляти відому Схему
	 * Класифікації Елементів, де це можливо.
	 */
	private String scheme;
	/**
	 * id: рядок
	 * 
	 * OpenContracting Description: Код класифікації взятий з вибраної схеми.
	 */
	private String id;
	/**
	 * description: рядок
	 * 
	 * OpenContracting Description: Текстовий опис або назва коду.
	 */
	private String description;
	/**
	 * uri: uri
	 * 
	 * OpenContracting Description: URI для ідентифікації коду. Якщо
	 * індивідуальні URI не доступні для елементів у схемі ідентифікації це
	 * значення треба залишити пустим.
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}
