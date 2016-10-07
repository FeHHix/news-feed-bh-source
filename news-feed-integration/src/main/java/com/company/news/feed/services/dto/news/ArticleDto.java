package com.company.news.feed.services.dto.news;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ArticleDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Getter @Setter private String author;
	@Getter @Setter private String text;
	@Getter @Setter private String bigText;

}
