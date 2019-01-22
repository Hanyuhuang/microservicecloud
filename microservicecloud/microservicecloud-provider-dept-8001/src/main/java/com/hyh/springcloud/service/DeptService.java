package com.hyh.springcloud.service;

import com.hyh.springcloud.entity.Dept;

import java.util.List;

public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept getDept(Integer deptno);

    public List<Dept> list();
}
