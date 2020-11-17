package com.itheima.controller;

import com.itheima.entity.Student;
import com.itheima.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignHandler {
    @Autowired
    private FeignProviderClient client;
    @GetMapping("/findAll")
    public Collection<Student>findAll(){
        return  client.findAll();
    }@GetMapping("/index")
    public  String index(){
        return client.index();
    }
}
