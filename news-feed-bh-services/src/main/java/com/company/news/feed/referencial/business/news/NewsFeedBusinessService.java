package com.company.news.feed.referencial.business.news;

import java.util.List;

import com.company.news.feed.referencial.entity.news.Article;

public interface NewsFeedBusinessService {
	
	public List<Article> getLastNews();

}
