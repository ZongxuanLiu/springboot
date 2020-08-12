package com.ly;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Liuying on 2018/9/11.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    //通过年龄来查询
    public List<Girl> findByAge(Integer age);
}
