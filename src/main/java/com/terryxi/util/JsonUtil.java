package com.terryxi.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

    public static Object jsonToObj(Object obj, String jsonStr) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            obj = mapper.readValue(jsonStr, obj.getClass());
        } catch (Exception e) {
            return "Json转换错误!";
        }
        return obj;
    }


    public static String objToJson(Object obj) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Json转换错误");
        }
    }
}
