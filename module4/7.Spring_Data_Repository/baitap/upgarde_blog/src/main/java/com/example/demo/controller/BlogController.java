package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.Impl.BlogServiceImpl;
import com.example.demo.service.Impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
    @Autowired
    private BlogServiceImpl blogService;

    @Autowired
    private CategoryServiceImpl categoryService;

    @GetMapping("/")
    public ModelAndView showBlog(@RequestParam(defaultValue = "0") int page){
        ModelAndView modelAndView = new ModelAndView("/blog/index");
        Page<Blog> blogs;
        Pageable pageable = PageRequest.of(page ,5);
        blogs = blogService.findAll(pageable);
        modelAndView.addObject("blogs" , blogs);
        return modelAndView;
    }

    @GetMapping("/create-blog")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog" , new Blog());
        modelAndView.addObject("categories" , categoryService.findAll());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView createBlog(@ModelAttribute("blog") Blog blog){
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        blogService.save(blog);
        modelAndView.addObject("blog" , new Blog());
        modelAndView.addObject("message" , "Created new blog!!!");
        return modelAndView;
    }
}
