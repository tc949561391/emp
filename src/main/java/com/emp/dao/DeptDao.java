package com.emp.dao;

import java.util.List;

import com.emp.model.Dept;

public interface DeptDao {
	public void deleteDept(Integer dno);
	public List<Dept> getAllDept();

}
