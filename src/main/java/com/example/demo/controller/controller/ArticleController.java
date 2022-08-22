package com.example.demo.controller.controller;

import com.example.demo.controller.dao.ArticleDao;
import com.example.demo.controller.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李明源
 */
@Controller
public class ArticleController {

    @Resource(name = "article_dao")
    private final ArticleDao articleDao;

    public ArticleController(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    @GetMapping("/article/{id}")
    @ResponseBody
    public Article article(@PathVariable("id") int id) {
        return articleDao.getArticleById(id);
    }

    @GetMapping("/articles")
    @ResponseBody
    public List<Article> articles() {
        return articleDao.getArticles();
    }

    @GetMapping("/add")
    @ResponseBody
    public Article addGet(@RequestParam("id") int id,
                         @RequestParam("author") String author,
                         @RequestParam("title") String title,
                         @RequestParam("content") String content,
                         @RequestParam("modify_time") String modifyTime) {
        Article article = new Article(id, author, title, content, modifyTime);
        articleDao.save(article);
        return article;
    }
}
