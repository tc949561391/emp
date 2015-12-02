package com.emp.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emp.dao.EmpDao;
import com.emp.model.Emp;
@Service("empService")
public class EmpServiceImpl implements EmpService {
	@Resource
	private EmpDao empDao;

	@Override
	@Transactional(readOnly=true)
	public List<Emp> getAllEmps() {
		// TODO Auto-generated method stub
		return empDao.getAllEmps();
	}

}
