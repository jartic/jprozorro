package org.tos.jartic.api.prozorro.v0070.model;

public class Question {
	/**
	 * id: uid, ���������� �����������
	 */
	private String id;
	/**
	 * author: Organization, ����������
	 * 
	 * ��� ���� ������� (contactPoint - ������, identification - ����������,
	 * ��� �� ������ �����������).
	 */
	private Organization author;
	/**
	 * title: �����, �����������
	 * 
	 * ����� ���������.
	 */
	private String title;
	/**
	 * description: �����
	 * 
	 * ���� ���������.
	 */
	private String description;
	/**
	 * date: �����, Date, ���������� �����������
	 * 
	 * ���� ���������.
	 */
	private Date date;
	/**
	 * dateAnswered: �����, Date, ���������� �����������
	 * 
	 * ����, ���� ���� ������ �������.
	 */
	private Date dateAnswered;
	/**
	 * answer: �����
	 * 
	 * ³������ �� ������ �������.
	 */
	private String answer;
	/**
	 * questionOf: �����
	 * 
	 * ������ ��������:
	 * 
	 * tender item lot
	 */
	private String questionOf;
	/**
	 * relatedItem: �����
	 * 
	 * ID ��������� Lot ��� Item.
	 */
	private String relatedItem;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Organization getAuthor() {
		return author;
	}

	public void setAuthor(Organization author) {
		this.author = author;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDateAnswered() {
		return dateAnswered;
	}

	public void setDateAnswered(Date dateAnswered) {
		this.dateAnswered = dateAnswered;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getQuestionOf() {
		return questionOf;
	}

	public void setQuestionOf(String questionOf) {
		this.questionOf = questionOf;
	}

	public String getRelatedItem() {
		return relatedItem;
	}

	public void setRelatedItem(String relatedItem) {
		this.relatedItem = relatedItem;
	}

}
