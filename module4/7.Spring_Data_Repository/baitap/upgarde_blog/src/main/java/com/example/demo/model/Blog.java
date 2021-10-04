package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    private String title;
    private String subtitle;
    private String image;
    @Column(columnDefinition = "TEXT")
    private String content;

    @ManyToOne(targetEntity = Category.class)
    @JoinColumn(name = "category_id" , referencedColumnName = "id")
    private Category category1;

    public Blog() {
    }

    public Blog(int id, String title, String subtitle, String image, String content, Category category1) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;
        this.content = content;
        this.category1 = category1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory1() {
        return category1;
    }

    public void setCategory1(Category category1) {
        this.category1 = category1;
    }
}
