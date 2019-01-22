package com.hyh.springcloud.dao;

import com.hyh.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept getDept(Integer deptno);

    public List<Dept> list();

}
