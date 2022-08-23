package com.example.demo.controller.controller;

import com.example.demo.controller.dao.ArticleDao;
import com.example.demo.controller.dao.UserDao;
import com.example.demo.controller.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 李明源
 */
@Controller()
@RequestMapping("/security")
public class ArticleWithCookieController {

    @Resource(name = "article_dao")
    private final ArticleDao articleDao;

    @Resource(name = "user_dao")
    private final UserDao userDao;

    public ArticleWithCookieController(ArticleDao articleDao, UserDao userDao) {
        this.articleDao = articleDao;
        this.userDao = userDao;
    }

    @GetMapping("/article/{id}")
    @ResponseBody
    public Article article(@PathVariable("id") int id, @RequestParam("cookie") String cookie) {
        if (userDao.isLogin(cookie)) {
            return articleDao.getArticleById(id);
        }
        return new Article();
    }

    @GetMapping("/articles")
    @ResponseBody
    public List<Article> articles(@RequestParam("cookie") String cookie) {
        if (userDao.isLogin(cookie)) {
            return articleDao.getArticles();
        }
        return new ArrayList<>();
    }
}
