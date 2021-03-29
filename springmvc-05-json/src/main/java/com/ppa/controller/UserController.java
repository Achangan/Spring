package com.ppa.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ppa.pojo.User;
import com.ppa.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping("/j1")
    //@ResponseBody//不会走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {

        //jackson   objectMapper
        ObjectMapper objectMapper = new ObjectMapper();
        //创建一个对象
        User user = new User("ppa", 5, "男");
        String s = objectMapper.writeValueAsString(user);
        return s;
    }
    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        List<User> userList = new ArrayList<>();
        User user1 = new User("ppa", 5, "男");
        User user2= new User("ppa", 5, "男");
        User user3 = new User("ppa", 5, "男");
        User user4 = new User("ppa", 5, "男");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        String s = objectMapper.writeValueAsString(userList);
        return s;
    }

    @RequestMapping("/j3")
    //@ResponseBody//不会走视图解析器，会直接返回一个字符串
    public String json3() throws JsonProcessingException {
//
//        ObjectMapper objectMapper = new ObjectMapper();
//
//
//        //使用ObjectMapper格式话输出
//
//        objectMapper.configure(SerializationFeature.WRITE_DURATIONS_AS_TIMESTAMPS,false);
//        //ObjectMapper,时间解析后的默认格式为：Timestamp，时间戳
//
//        //自定义日期格式
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        objectMapper.setDateFormat(sdf);

        Date date = new Date();
        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }


}
