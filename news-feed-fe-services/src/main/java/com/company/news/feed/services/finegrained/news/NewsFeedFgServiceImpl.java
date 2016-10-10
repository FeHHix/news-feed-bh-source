package com.company.news.feed.services.finegrained.news;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.news.feed.referencial.business.news.NewsFeedBusinessService;
import com.company.news.feed.services.dto.news.ArticleDto;

@Service
public class NewsFeedFgServiceImpl implements NewsFeedFgService {
	
	@Autowired
	private NewsFeedBusinessService newsFeedBusinessService;

	public List<ArticleDto> getLastNews() {
		newsFeedBusinessService.getLastNews();
		return null;
	}

}
