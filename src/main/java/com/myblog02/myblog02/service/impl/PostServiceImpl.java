package com.myblog02.myblog02.service.impl;

import com.myblog02.myblog02.entity.Post;
import com.myblog02.myblog02.payload.PostDto;
import com.myblog02.myblog02.repository.PostRepository;
import com.myblog02.myblog02.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {

        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post savedPost = postRepository.save(post);//all data saved in db

        PostDto dto=new PostDto();
        dto.setTitle(savedPost.getTitle());
        dto.setDescription(savedPost.getDescription());
        dto.setContent(savedPost.getContent());

        return dto;
    }
}
