package com.company.news.feed.referencial.business.news;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.company.news.feed.referencial.access.news.NewsRepository;
import com.company.news.feed.referencial.entity.news.Article;

public class NewsFeedBusinessServiceImpl implements NewsFeedBusinessService {
	
	@Autowired
	private NewsRepository newsRepository;

	@Override
	public List<Article> getLastNews() {
		return (List<Article>) newsRepository.findAll();
	}

}
