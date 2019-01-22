package com.hyh.springcloud.controller;

import com.hyh.springcloud.entity.Dept;
import com.hyh.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {


    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping("/consumer/dept/add")
    public boolean addDept(Dept dept){
        return deptClientService.add(dept);
    }

    @GetMapping("consumer/dept/get/{deptno}")
    public Dept getDept(@PathVariable("deptno")Integer deptno){
        return deptClientService.get(deptno);
    }

    @GetMapping("consumer/dept/list")
    public List<Dept> list(){
        return deptClientService.list();
    }

}
