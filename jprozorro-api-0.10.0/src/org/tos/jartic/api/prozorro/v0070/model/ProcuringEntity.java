package org.tos.jartic.api.prozorro.v0070.model;

import java.util.ArrayList;

public class ProcuringEntity {
	/**
	 * name: �����, ������������
	 * 
	 * OpenContracting Description: ����� ����������.
	 */
	private String name;
	/**
	 * identifier: Identifier
	 * 
	 * OpenContracting Description: ������������� ���� ����������.
	 */
	private Identifier identifier;
	/**
	 * additionalIdentifiers:
	 * 
	 * ������ �ᒺ��� Identifier
	 */
	private ArrayList<Identifier> additionalIdentifiers = new ArrayList<>();
	/**
	 * address: Address, ����������
	 */
	private Address address;
	/**
	 * contactPoint: ContactPoint, ����������
	 */
	private ContactPoint contactPoint;
	/**
	 * kind: �����
	 * 
	 * ��� ���������
	 * 
	 * ������ ��������: general - �������� (���������)
	 * 
	 * special - ��������, �� ������� �������� � ������� ������
	 * ��������������
	 * 
	 * defense - ��������, �� ������� ������� ��� ������ �������
	 * 
	 * other - ������� �����, �� �� � ����������� � ������� ������, ��� �
	 * ����������, ������������, ��������� ������������, ��������������
	 * ������������ �� �ᒺ�������� ���������, � ���� �������� �� ����������
	 * ������ ������ 50 � ����� �������
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
