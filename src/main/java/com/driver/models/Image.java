package com.driver.models;
import javax.persistence.*;

@Entity
@Table(name = "image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ImageId;

    private String description;
    private String dimension;

    @ManyToOne
    @JoinColumn
    private Blog blog;

    public Image(){

    }
    public Image(  Blog blog,String description, String dimension) {
        this.description = description;
        this.dimension = dimension;
        this.blog = blog;
    }

    public Image(Integer imageId, String description, String dimension, Blog blog) {
        ImageId = imageId;
        this.description = description;
        this.dimension = dimension;
        this.blog = blog;
    }

    public Integer getImageId() {
        return ImageId;
    }

    public void setImageId(Integer imageId) {
        ImageId = imageId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}