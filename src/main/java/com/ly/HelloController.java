package com.ly;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Liuying on 2018/9/6.
 */
//@Controller
//@ResponseBody
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${content}")
//    private String content;

    @Autowired
    private GrilProperties grilProperties;

//    @RequestMapping(value="/hello", method= RequestMethod.GET) //url路径
//    @RequestMapping(value={"/hello","hi"}, method= RequestMethod.GET) //多个url路径都可以访问这个方法，可以写成数组
//    @RequestMapping(value="/say/{id}", method= RequestMethod.GET) //1。url后跟查数的写法  直接/say/id 访问 使用@PathVariable 注解
//    @RequestMapping(value="/say", method= RequestMethod.GET) //1。url后跟查数的写法  /say?id= 访问 使用@RequestParam
      @GetMapping(value = "/say")  //了解其他组合注解  简化书写

//    public String say(@RequestParam ("id") Integer myId){ //id为必传
    public String say(@RequestParam (value = "id",required = false , defaultValue = "0") Integer myId){ //id不是必传的 设置默认值
//        return grilProperties.getCupSize();
//    return "index";
//        return "id:" +id;
        return "id:" + myId;

    }

}
