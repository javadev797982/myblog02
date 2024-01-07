package com.myblog02.myblog02.repository;

import com.myblog02.myblog02.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
