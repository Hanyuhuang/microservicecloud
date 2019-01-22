package com.hyh.springcloud.service;

import java.util.List;

import com.hyh.springcloud.entity.Dept;
import org.springframework.stereotype.Component;


import feign.hystrix.FallbackFactory;

@Component // 不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>
{
	@Override
	public DeptClientService create(Throwable throwable)
	{
		return new DeptClientService() {

			public Dept get(Integer deptno)
			{
				return new Dept(deptno,"该ID：" + deptno + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭","no this database in MySQL");
			}

			@Override
			public List<Dept> list()
			{
				return null;
			}

			@Override
			public boolean add(Dept dept)
			{
				return false;
			}
		};
	}
}
