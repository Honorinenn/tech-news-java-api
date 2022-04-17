package com.technews.model;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "comment")

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;

public class Comment {
    private Integer id;
    private String commentText;
    private Integer userId;
    private Integer postId;
}
