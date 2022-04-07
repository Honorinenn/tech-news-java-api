package com.technews.model;

public class Post {
    private Integer id;
    private String title;
    private String postUrl;
    private String userName;
    private int voteCount;
    private Integer userId;
    private Date postedAt = new Date();
    private Date updatedAt = new Date();
    private List<Comment> comments;

    @Entity
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @Table(name = "post")
    public class Post {

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Transient
    private String userName;
    @Transient
    private int voteCount;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "posted_at")
    private Date postedAt = new Date();

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "updated_at")
    private Date updatedAt = new Date();
}
