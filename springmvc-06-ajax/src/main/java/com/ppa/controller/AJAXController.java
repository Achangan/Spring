package com.ppa.controller;

import com.ppa.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AJAXController {

    @RequestMapping("/t1")
    public String test(){

        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1.param=>" +name);
        if ("ppa".equals(name)){
            response.getWriter().write("true");
        }else {
            response.getWriter().write("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        ArrayList<User> users = new ArrayList<>();
        //添加数据
        users.add(new User("ppa",1,"男"));
        users.add(new User("hyq",1,"男"));
        users.add(new User("wdy",1,"男"));
        return users;
    }

    @RequestMapping("/a3")
    public String a3(String name,String pwd){
        String msg = "";
        if (name!=null){
            //admin这些数据存在数据库中
            if ("admin".equals(name)){
                msg="ok";
            }else {
                msg = "用户名有误";
            }
        }
        if (pwd!=null){
            //admin这些数据存在数据库中
            if ("123456".equals(pwd)){
                msg="ok";
            }else {
                msg = "密码有误";
            }
        }
        return msg;
    }
}
