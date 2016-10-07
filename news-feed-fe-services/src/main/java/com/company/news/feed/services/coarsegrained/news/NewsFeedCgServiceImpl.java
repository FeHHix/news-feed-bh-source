package com.company.news.feed.services.coarsegrained.news;

import java.util.List;

import javax.jws.WebService;

import com.company.news.feed.services.dto.news.ArticleDto;
import com.company.news.feed.services.finegrained.news.NewsFeedFgService;

@WebService(endpointInterface = "com.company.news.feed.services.coarsegrained.news.NewsFeedCgService")
public class NewsFeedCgServiceImpl implements NewsFeedCgService {
	
	private NewsFeedFgService newsFeedFgService;

	public List<ArticleDto> getLastNews() {
		return newsFeedFgService.getLastNews();
	}

}
