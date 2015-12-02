package com.emp.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.emp.dao.DeptDao;
import com.emp.dao.EmpDao;
import com.emp.model.Dept;

@Repository("deptService")
public class DeptServerImpl implements DeptService{
	@Resource
	private DeptDao deptDao;
	@Resource
	private EmpDao empDao;
	@Override
	@Transactional
	public void deleteDept(Integer dno) {
		// TODO Auto-generated method stub
		empDao.deleteEmpsByDeptNo(dno);
		deptDao.deleteDept(dno);
	}
	@Override
	@Transactional(readOnly=true)
	public List<Dept> getAllDepts() {
		// TODO Auto-generated method stub
		return deptDao.getAllDept();
	}

}
