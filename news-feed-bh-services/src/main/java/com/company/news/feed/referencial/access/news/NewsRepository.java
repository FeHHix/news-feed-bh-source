package com.company.news.feed.referencial.access.news;

import org.springframework.data.repository.CrudRepository;

import com.company.news.feed.referencial.entity.news.Article;

public interface NewsRepository extends CrudRepository<Article, Long> {}
