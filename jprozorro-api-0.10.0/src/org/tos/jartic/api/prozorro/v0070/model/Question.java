package org.tos.jartic.api.prozorro.v0070.model;

public class Question {
	/**
	 * id: uid, генерується автоматично
	 */
	private String id;
	/**
	 * author: Organization, обов’язково
	 * 
	 * Хто задає питання (contactPoint - людина, identification - організація,
	 * яку ця людина представляє).
	 */
	private Organization author;
	/**
	 * title: рядок, обов’язковий
	 * 
	 * Назва запитання.
	 */
	private String title;
	/**
	 * description: рядок
	 * 
	 * Опис запитання.
	 */
	private String description;
	/**
	 * date: рядок, Date, генерується автоматично
	 * 
	 * Дата публікації.
	 */
	private Date date;
	/**
	 * dateAnswered: рядок, Date, генерується автоматично
	 * 
	 * Дата, коли було надано відповідь.
	 */
	private Date dateAnswered;
	/**
	 * answer: рядок
	 * 
	 * Відповідь на задане питання.
	 */
	private String answer;
	/**
	 * questionOf: рядок
	 * 
	 * Можливі значення:
	 * 
	 * tender item lot
	 */
	private String questionOf;
	/**
	 * relatedItem: рядок
	 * 
	 * ID пов’язаних Lot або Item.
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
