package com.controller;

import com.domain.Address;
import com.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.soap.SAAJMetaFactory;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    //普通数据传参
    @RequestMapping("/save")
    @ResponseBody
    public String save(String name,int age){
        System.out.println("普通参数传递 name ==>"+name);
        System.out.println("普通参数传递 name ==>"+age);
        System.out.println("user save ...");
        return "{'module' : 'springmvc'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(String name,int age){
        System.out.println("普通参数传递 name ==>"+name);
        System.out.println("普通参数传递 name ==>"+age);
        System.out.println("user delete ...");
        return "{'module' : 'springmvc'}";
    }

    //Pojo数据传参
    @RequestMapping("pojoParam")
    @ResponseBody
    public String pojoPram(User user){
        System.out.println("pojo参数传递: user ==>"+user);
        return "{'module : 'pojo param''}";
    }

    //pojo参数嵌套传参
        @RequestMapping("/pojoInParam")
    @ResponseBody
        public String pojoInParam( User user){
        System.out.println("pojo嵌套传参: user ==>"+user);
        return "{'module : 'pojo InParam''}";
    }

    //数组参数
    @RequestMapping("/valueParam")
    @ResponseBody
    public String valueParam(@RequestParam String [] likes){
        System.out.println("数组传参: user ==>"+ Arrays.toString(likes));
        return "{'module : 'values param''}";
    }

    //集合参数
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes){
        System.out.println("集合传参: user ==>"+likes);
        return "{'module : 'list param''}";
    }

    //对象转json数据
    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo(){
        User user = new User();
        user.setName("张飞");
        user.setAge(50);

        return user;
    }

    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        User user1 = new User();
        user1.setName("我的发");
        user1.setAge(25);


        User user2 = new User();
        user2.setName("找死");
        user2.setAge(18);


        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);

        return userList;
    }
}
