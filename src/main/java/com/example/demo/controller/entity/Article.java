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

    private String city;

    private int length;

    private String modifyTime;

    public Article() {
    }

    public Article(int id, String author, String title, String content, String city, int length, String modifyTime) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.content = content;
        this.city = city;
        this.length = length;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }
}
