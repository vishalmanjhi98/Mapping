package com.mappingexample.mapping.controller;
import com.mappingexample.mapping.entity.Comment;
import com.mappingexample.mapping.entity.Post;
import com.mappingexample.mapping.repository.CommentRepository;
import com.mappingexample.mapping.repository.PostRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/comment")
public class CommentController {
    private PostRepository postRepository;

    private CommentRepository commentRepository;

    public CommentController(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

  // http://localhost:8080/api/v1/comment/comment
    @PostMapping("/comment")
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment, @RequestParam long id){
        Post post = postRepository.findById(id).get();
        comment.setPost(post);
        Comment savedComment = commentRepository.save(comment);
        return new ResponseEntity<>(savedComment,HttpStatus.OK);
    }
}
