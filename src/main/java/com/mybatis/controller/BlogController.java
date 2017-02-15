package com.mybatis.controller;

import com.mybatis.model.Blog;
import com.mybatis.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by sijingl on 2017-01-13.
 */
@Controller
@RequestMapping("/blog")
public class BlogController {
    @Resource
    private BlogService blogService;

    @RequestMapping("showBlog")
    public String toIndex(HttpServletRequest request, Model model) {
        int id = Integer.parseInt(request.getParameter("id"));
        Blog blog = this.blogService.selectByPrimaryKey(id);
        model.addAttribute("blog", blog);
        return "showBlog";
    }

    @RequestMapping("showBlogFtl")
    public String toIndexFtl(HttpServletRequest request, Model model) {
        int id = Integer.parseInt(request.getParameter("id"));
        Blog blog = this.blogService.selectByPrimaryKey(id);
        model.addAttribute("blog", blog);
        return "showBlog";
    }
}
