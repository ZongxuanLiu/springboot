package com.ly.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ly
 * @date: 2020/7/23 11:33
 * @title:
 * @company:zjhcsoft
 * @description:
 */
@Controller
public class IndexController {
    /**
     * 第一个例子
     * @return
     */
    @RequestMapping(value = "/say")
    public @ResponseBody String say(){
        System.out.println();
        return "Hello SpringBoot!";
    }

    /**
     * 返回Map
     * @return
     */
    @RequestMapping(value = "/mapvalue")
    public @ResponseBody Map<String,Object> mapValue(){
        Map<String,Object> map = new HashMap(1);
        map.put("massage","SpringBoot Project");
        return map;
    }
}
