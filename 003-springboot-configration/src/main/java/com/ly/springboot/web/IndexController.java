package com.ly.springboot.web;

import com.ly.springboot.entity.ABC;
import org.apache.tomcat.util.net.IPv6Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author liuying
 */
@Controller
public class IndexController {
    @Value("${school.name}")
    private String schoolName;
    @Value("${websit}")
    private String websit;
    /**
     * 自定义配置文件映射到实体类
     */
    @Autowired
    private ABC abc;

    @RequestMapping(value = "/say")
    public @ResponseBody String say(){
        return "Hello" + schoolName+", websit is " +websit;
    }

    @RequestMapping(value = "/abc")
    public @ResponseBody
    String abc(){
        return "abc.name:"+abc.getName();
    }

    @RequestMapping(value = "/jspView")
    public ModelAndView jspView(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","Hello SpringBoot!");
        mv.setViewName("jspView");
        return mv;
    }

    /**
     * 将上面的方法拆开的一种写法
     * @param model
     * @return
     */
    @RequestMapping(value = "/index")
    public String index(Model model){
        model.addAttribute("message","Hello World!");
        return "jspView";
    }
}
