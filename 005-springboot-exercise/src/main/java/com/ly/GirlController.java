package com.ly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Liuying on 2018/9/11.
 */
@RestController //
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    //查询所有的列表信息
    @GetMapping(value = "/girl")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

    //新增
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                          @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    //根据id
    @GetMapping(value = "/girls/{id}")
   public Girl girlFindOne(@PathVariable("id") Integer id){
        return girlRepository.findById(id).get();
    }
    //更新
    @PutMapping(value = "/girl/{id}")
    public Girl girlUpdate (@PathVariable("id") Integer id,
                            @RequestParam("cupSize") String cupSize,
                            @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    //删除
    @DeleteMapping("/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        girlRepository.deleteById(id);
    }


    //通过年龄查询
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl>  girlsListByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }
}
