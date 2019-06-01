package com.study.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

/**
 * @author yuanmeng
 * @create 2019-05-23 17:09
 */
@Controller
public class HelloControll {

    @GetMapping("/success")

    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
       map.put("users", Arrays.asList("德玛","西亚","皇子"));
        return "success";
    }
}
