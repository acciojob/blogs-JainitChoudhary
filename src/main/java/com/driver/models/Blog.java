package com.driver.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer blogId;

    private String title;

    private String content;

    @CreationTimestamp
    private Date pubDate;

    @ManyToOne
    @JoinColumn
    private User user;


    @OneToMany(mappedBy = "blog", cascade = CascadeType.ALL)
    @JoinColumn
    private List<Image>imagesList;



    public Blog(){

    }

    public Blog(User user, String title, String content) {
        this.title = title;
        this.content = content;
        this.user = user;
    }


    public Blog(Integer blogId, String title, String content, Date pubDate, User user, List<Image> imagesList) {
        this.blogId = blogId;
        this.title = title;
        this.content = content;
        this.pubDate = pubDate;
        this.user = user;
        this.imagesList = imagesList;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Image> getImagesList() {
        return imagesList;
    }

    public void setImagesList(List<Image> imagesList) {
        this.imagesList = imagesList;
    }
}
