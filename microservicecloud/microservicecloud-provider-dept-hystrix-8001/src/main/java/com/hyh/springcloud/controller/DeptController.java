package com.hyh.springcloud.controller;

import com.hyh.springcloud.entity.Dept;
import com.hyh.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/get/{deptno}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept getDept(@PathVariable("deptno") Integer deptno){
        Dept dept = deptService.getDept(deptno);
        if (dept==null){
            throw new RuntimeException("该ID："+deptno+"不存在！");
        }
        return dept;
    }

    @GetMapping("/dept/list")
    public List<Dept> list(){
        List<Dept> list = deptService.list();
        return list;
    }

    @RequestMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    public Dept processHystrix_Get(@PathVariable("deptno") Integer deptno){
        return new Dept(deptno,"该ID："+deptno+"不存在！","no this database in MySQL");
    }
}
