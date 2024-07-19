package com.mappingexample.mapping.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "post_name", nullable = false, length = 150)
    private String postName;

    @Column(name = "post_type", nullable = false, length = 150)
    private String postType;

}