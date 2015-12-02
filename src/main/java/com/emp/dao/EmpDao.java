package com.emp.dao;

import java.util.List;

import com.emp.model.Emp;

public interface EmpDao {
	public List<Emp> getAllEmps();
	public void deleteEmpsByDeptNo(Integer dno);
}