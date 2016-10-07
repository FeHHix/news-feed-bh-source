package com.company.news.feed.services.coarsegrained.news;

import java.util.List;

import javax.jws.WebService;

import com.company.news.feed.services.dto.news.ArticleDto;

@WebService
public interface NewsFeedCgService {
	
	public List<ArticleDto> getLastNews();

}
