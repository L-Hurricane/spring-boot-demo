package com.example.demo.controller.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * @author 李明源
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Article {

    private int id;

    private String author;

    private String title;

    private String content;

    private String modifyTime;

    public Article() {
    }

    public Article(int id, String author, String title, String content, String modifyTime) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.content = content;
        this.modifyTime = modifyTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }
}
