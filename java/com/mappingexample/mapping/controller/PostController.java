package com.mappingexample.mapping.controller;
import com.mappingexample.mapping.entity.Post;
import com.mappingexample.mapping.repository.PostRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/post")
public class PostController {

    private PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    // http://localhost:8080/api/v1/post/post
    @PostMapping("/post")
    public ResponseEntity<Post> createPost(@RequestBody Post post){
        Post saved = postRepository.save(post);
        return new ResponseEntity<Post>(saved, HttpStatus.CREATED);
    }
}
