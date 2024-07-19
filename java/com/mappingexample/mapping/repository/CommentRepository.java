package com.mappingexample.mapping.repository;

import com.mappingexample.mapping.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}