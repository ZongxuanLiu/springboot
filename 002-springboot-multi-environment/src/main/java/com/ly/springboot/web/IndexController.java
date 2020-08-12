package com.ly.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ly
 * @date: 2020/7/24 17:26
 * @title:
 * @company:zjhcsoft
 * @description:
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/say")
    public @ResponseBody
    String say() {
        return "hello multiple SpringBoot!";
    }

}
