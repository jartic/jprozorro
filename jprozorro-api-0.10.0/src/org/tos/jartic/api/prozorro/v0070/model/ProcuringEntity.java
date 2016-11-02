package org.tos.jartic.api.prozorro.v0070.model;

import java.util.ArrayList;

public class ProcuringEntity {
	/**
	 * name: рядок, багатомовний
	 * 
	 * OpenContracting Description: Назва організації.
	 */
	private String name;
	/**
	 * identifier: Identifier
	 * 
	 * OpenContracting Description: Ідентифікатор цієї організації.
	 */
	private Identifier identifier;
	/**
	 * additionalIdentifiers:
	 * 
	 * Список об’єктів Identifier
	 */
	private ArrayList<Identifier> additionalIdentifiers = new ArrayList<>();
	/**
	 * address: Address, обов’язково
	 */
	private Address address;
	/**
	 * contactPoint: ContactPoint, обов’язково
	 */
	private ContactPoint contactPoint;
	/**
	 * kind: рядок
	 * 
	 * Тип замовника
	 * 
	 * Можливі значення: general - Замовник (загальний)
	 * 
	 * special - Замовник, що здійснює діяльність в окремих сферах
	 * господарювання
	 * 
	 * defense - Замовник, що здійснює закупівлі для потреб оборони
	 * 
	 * other - Юридичні особи, які не є замовниками в розумінні Закону, але є
	 * державними, комунальними, казенними підприємствами, господарськими
	 * товариствами чи об’єднаннями підприємств, у яких державна чи комунальна
	 * частка складає 50 і більше відсотків
	 */
	private String kind;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Identifier getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}

	public ArrayList<Identifier> getAdditionalIdentifiers() {
		return additionalIdentifiers;
	}

	public void setAdditionalIdentifiers(ArrayList<Identifier> additionalIdentifiers) {
		this.additionalIdentifiers = additionalIdentifiers;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ContactPoint getContactPoint() {
		return contactPoint;
	}

	public void setContactPoint(ContactPoint contactPoint) {
		this.contactPoint = contactPoint;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

}
