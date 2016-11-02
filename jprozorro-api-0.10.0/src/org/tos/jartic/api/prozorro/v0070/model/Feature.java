package org.tos.jartic.api.prozorro.v0070.model;

import java.util.ArrayList;

public class Feature {
	/**
	 * code: рядок, генерується автоматично
	 * 
	 * Код нецінового критерію.
	 */
	private String code;
	/**
	 * featureOf: рядок, обов’язковий
	 * 
	 * Можливі значення:
	 * 
	 * tenderer - учасник закупівлі lot item
	 */
	private String featureOf;
	/**
	 * relatedItem: рядок
	 * 
	 * ID пов’язаного Item або Lot (якщо значення featureOf дорівнює item або
	 * lot).
	 */
	private String relatedItem;
	/**
	 * title: рядок, багатомовний, обов’язковий
	 * 
	 * Назва критерію.
	 */
	private String title;
	/**
	 * description: рядок, багатомовний
	 * 
	 * Опис критерію.
	 */
	private String description;
	/**
	 * enum: список
	 * 
	 * Список значень:
	 * 
	 * value: float, обов’язково
	 * 
	 * Значення критерію. title: рядок, багатомовний, обов’язковий
	 * 
	 * Назва значення. description: рядок, багатомовний
	 * 
	 * Опис значення.
	 */
	private ArrayList<Enum> enumList = new ArrayList<>();

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFeatureOf() {
		return featureOf;
	}

	public void setFeatureOf(String featureOf) {
		this.featureOf = featureOf;
	}

	public String getRelatedItem() {
		return relatedItem;
	}

	public void setRelatedItem(String relatedItem) {
		this.relatedItem = relatedItem;
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

	public ArrayList<Enum> getEnumList() {
		return enumList;
	}

	public void setEnumList(ArrayList<Enum> enumList) {
		this.enumList = enumList;
	}

}
