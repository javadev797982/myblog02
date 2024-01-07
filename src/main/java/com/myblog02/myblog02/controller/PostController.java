package com.myblog02.myblog02.controller;

import com.myblog02.myblog02.payload.PostDto;
import com.myblog02.myblog02.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;//postService is interface//it create object of Impl and inject in postService

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){//dto used bcz of custom response can send back
        PostDto dto = postService.createPost(postDto);//method calling of payload(createPost)
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

}