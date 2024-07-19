package com.mappingexample.mapping.repository;

import com.mappingexample.mapping.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}