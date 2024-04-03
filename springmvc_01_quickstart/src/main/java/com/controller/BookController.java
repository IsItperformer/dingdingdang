package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/book")
public class BookController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(String name,int age){
        System.out.println("普通参数传递 name ==>"+name);
        System.out.println("普通参数传递 name ==>"+age);
        System.out.println("book save...");
        return "{'module' : 'springMvc'}";
    }
}
