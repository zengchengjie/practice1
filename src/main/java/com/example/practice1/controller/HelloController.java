package com.example.practice1.controller;

import com.example.practice1.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 10062376
 * @Date: 2019/1/10 10:49
 * @Description:
 */
@RestController
public class HelloController {
    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;
    @Autowired
    private AuthorSettings authorSettings;
    @RequestMapping("/test")
    public String test(@RequestParam (value = "id")String name) {
        return "Hello"+name+bookAuthor+bookName+authorSettings.getName();
    }
}
