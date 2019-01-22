package com.hyh.springcloud.controller;

import com.hyh.springcloud.entity.Dept;
import com.hyh.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/get/{deptno}")
    public Dept getDept(@PathVariable("deptno") Integer deptno){
        Dept dept = deptService.getDept(deptno);
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
}
