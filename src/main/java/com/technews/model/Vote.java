package com.technews.model;
private Integer id;
private Integer userId;
private Integer postId;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "vote")

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;

public class Vote {
}
