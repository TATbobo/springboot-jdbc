package com.tucker.springbootjdbc01.testController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class test {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @ResponseBody
    @GetMapping("/test")
    public Map<String,Object> map(){
        List<Map<String,Object>> maps=jdbcTemplate.queryForList("SELECT * from department");
        return maps.get(0);
    }
}
