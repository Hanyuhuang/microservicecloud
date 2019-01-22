package com.hyh.springcloud.service;

import java.util.List;

import com.hyh.springcloud.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService
{
	@GetMapping("/dept/get/{deptno}")
	public Dept get(@PathVariable("deptno") Integer deptno);

	@GetMapping("/dept/list")
	public List<Dept> list();

	@RequestMapping("/dept/add")
	public boolean add(Dept dept);
}
