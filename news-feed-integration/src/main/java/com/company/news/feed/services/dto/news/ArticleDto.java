package com.company.news.feed.services.dto.news;

import java.io.Serializable;

public class ArticleDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String author;
	private String text;
	private String bigText;
	
	public ArticleDto() {
	}

	public ArticleDto(String author, String text, String bigText) {
		this.author = author;
		this.text = text;
		this.bigText = bigText;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getBigText() {
		return bigText;
	}

	public void setBigText(String bigText) {
		this.bigText = bigText;
	}

}
