package com.emp.web;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.emp.dao.EmpDao;
import com.emp.model.Emp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:root-context.xml")
public class TestDemo {
	@Resource
	private EmpDao empDao;

	@Test
	public void name() {
		List<Emp> allEmps = empDao.getAllEmps();
		System.out.println(allEmps.size());

	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");

		context.start();

		EmpDao empDao = (EmpDao) context.getBean("empDao");
		List<Emp> allEmps = empDao.getAllEmps();
		System.out.println(allEmps.size());
		System.out.println(empDao);
	}

}
