package com.company.news.feed.services.finegrained.news;

import java.util.List;

import com.company.news.feed.services.dto.news.ArticleDto;

public interface NewsFeedFgService {
	
	public List<ArticleDto> getLastNews();

}
