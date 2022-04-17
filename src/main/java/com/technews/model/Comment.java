package com.technews.model;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "comment")

public class Comment {
    private Integer id;
    private String commentText;
    private Integer userId;
    private Integer postId;
}
