package com.ppa.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

public class JsonUtils {

    public static String getJson(Object object) throws JsonProcessingException {
        return getJson(object,"yyyy-MM-dd HH:mm:ss");
    }

    public static String getJson(Object object,String dateFormat) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        //使用ObjectMapper格式话输出

        objectMapper.configure(SerializationFeature.WRITE_DURATIONS_AS_TIMESTAMPS,false);
        //ObjectMapper,时间解析后的默认格式为：Timestamp，时间戳

        //自定义日期格式
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);

        objectMapper.setDateFormat(sdf);

        return objectMapper.writeValueAsString(object);
    }
}
