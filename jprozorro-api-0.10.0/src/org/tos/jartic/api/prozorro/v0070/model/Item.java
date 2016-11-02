package org.tos.jartic.api.prozorro.v0070.model;

import java.util.ArrayList;

public class Item {
	/**
	 * id: рядок, генерується автоматично
	 */
	private String id;
	/**
	 * description: рядок, багатомовний, обов’язковий
	 * 
	 * OpenContracting Description: Опис товарів та послуг, які повинні бути
	 * надані.
	 */
	private String description;
	/**
	 * classification: Classification
	 * 
	 * OpenContracting Description: Початкова класифікація елемента. Дивіться у
	 * itemClassificationScheme, щоб визначити бажані списки класифікації,
	 * включно з CPV та GSIN.
	 * 
	 * Класифікація classification.scheme обов’язково повинна бути CPV.
	 * classification.id повинно бути дійсним CPV кодом.
	 */
	private Classification classification;
	/**
	 * additionalClassifications:
	 * 
	 * Список об’єктів Classification
	 * 
	 * OpenContracting Description: Масив додаткових класифікацій для елемента.
	 * Дивіться у список кодів itemClassificationScheme, щоб використати
	 * поширені варіанти в OCDS. Також можна використовувати для представлення
	 * кодів з внутрішньої схеми класифікації.
	 * 
	 * Обов’язково мати хоча б один елемент з ДКПП у стрічці scheme.
	 */
	private ArrayList<Classification> additionalClassifications = new ArrayList<>();
	/**
	 * unit: Unit
	 * 
	 * OpenContracting Description: Опис одиниці виміру товару, наприклад,
	 * години, кілограми. Складається з назви одиниці та значення однієї
	 * одиниці.
	 */
	private Unit unit;
	/**
	 * quantity: ціле число
	 * 
	 * OpenContracting Description: Кількість необхідних одиниць.
	 */
	private int quantity;
	/**
	 * deliveryDate: Period
	 * 
	 * Період, протягом якого елемент повинен бути доставлений.
	 */
	private Period deliveryDate;
	/**
	 * deliveryAddress:
	 * 
	 * Address
	 * 
	 * Адреса місця, куди елемент повинен бути доставлений.
	 */
	private Address deliveryAddress;
	/**
	 * deliveryLocation:
	 * 
	 * словник
	 * 
	 * Географічні координати місця доставки. Складається з таких компонентів:
	 * 
	 * latitude: рядок, обов’язковий longitude: рядок, обов’язковий elevation:
	 * рядок, не обов’язково, переважно не використовується deliveryLocation
	 * зазвичай має вищий пріоритет ніж deliveryAddress, якщо вони обидва
	 * вказані.
	 */
	private DeliveryLocation deliveryLocation;
	/**
	 * relatedLot: рядок
	 * 
	 * ID пов’язаного Lot.
	 */
	private String relatedLot;
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
	public Classification getClassification() {
		return classification;
	}
	public void setClassification(Classification classification) {
		this.classification = classification;
	}
	public ArrayList<Classification> getAdditionalClassifications() {
		return additionalClassifications;
	}
	public void setAdditionalClassifications(ArrayList<Classification> additionalClassifications) {
		this.additionalClassifications = additionalClassifications;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Period getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Period deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Address getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public DeliveryLocation getDeliveryLocation() {
		return deliveryLocation;
	}
	public void setDeliveryLocation(DeliveryLocation deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}
	public String getRelatedLot() {
		return relatedLot;
	}
	public void setRelatedLot(String relatedLot) {
		this.relatedLot = relatedLot;
	}
	
	
}
