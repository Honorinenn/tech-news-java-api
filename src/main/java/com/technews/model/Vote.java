package com.technews.model;
private Integer id;
private Integer userId;
private Integer postId;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "vote")

public class Vote {
}
