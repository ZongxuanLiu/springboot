package com.ly;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Liuying on 2018/9/10.
 */
@Entity //对应数据库的表
public class Girl {
    @Id // 自增
    @GeneratedValue
    private Integer id;

    private Integer age;

    private String cupSize;



    public Girl() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
