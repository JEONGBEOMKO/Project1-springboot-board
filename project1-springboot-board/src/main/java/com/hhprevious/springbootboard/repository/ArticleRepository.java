package com.hhprevious.springbootboard.repository;

import com.hhprevious.springbootboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}