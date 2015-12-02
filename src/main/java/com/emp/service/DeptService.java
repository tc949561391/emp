package com.emp.service;

import java.util.List;

import com.emp.model.Dept;

public interface DeptService {
	public void deleteDept(Integer dno);
	public List<Dept> getAllDepts();

}
