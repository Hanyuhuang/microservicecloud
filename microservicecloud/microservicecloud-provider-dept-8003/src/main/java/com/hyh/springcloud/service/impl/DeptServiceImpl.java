package com.hyh.springcloud.service.impl;

import com.hyh.springcloud.dao.DeptDao;
import com.hyh.springcloud.entity.Dept;
import com.hyh.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept getDept(Integer deptno) {
        return deptDao.getDept(deptno);
    }

    @Override
    public List<Dept> list() {
        return deptDao.list();
    }
}
