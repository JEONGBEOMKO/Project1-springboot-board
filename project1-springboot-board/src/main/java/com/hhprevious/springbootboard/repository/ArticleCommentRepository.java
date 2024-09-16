package com.hhprevious.springbootboard.repository;

import com.hhprevious.springbootboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
