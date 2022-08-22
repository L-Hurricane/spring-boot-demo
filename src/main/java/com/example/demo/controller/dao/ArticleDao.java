package com.example.demo.controller.dao;

import com.example.demo.controller.entity.Article;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author 李明源
 */
@Service("article_dao")
public class ArticleDao {

    private final List<Article> articles;

    @PostConstruct
    public void init() {
        Article article1 = new Article(1, "title1", "author1", "content1 content1", "2022-08-22 15:22:00");
        Article article2 = new Article(2, "title2", "author2", "content2 content2", "2022-08-22 15:23:00");
        articles.add(article1);
        articles.add(article2);
    }

    public ArticleDao(List<Article> articles) {
        this.articles = articles;
    }

    public Article getArticleById(int id) {
        return articles.stream()
                .filter(article -> article.getId() == id)
                .findFirst()
                .orElse(new Article());
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void save(Article article) {
        articles.add(article);
    }
}
