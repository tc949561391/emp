package com.emp.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.emp.model.Dept;

@Repository("deptDao")
public class DeptDaoImpl implements DeptDao {
	@Resource
	private JdbcTemplate jdbcTemplate;

	@Override
	public void deleteDept(Integer dno) {
		// TODO Auto-generated method stub
		String sql = "delete from dept where deptno=?";
		int res = jdbcTemplate.update(sql, dno);
		System.out.println(res);

	}

	@Override
	public List<Dept> getAllDept() {
		// TODO Auto-generated method stub
		String sql = "select * from dept";
		List<Dept> depts = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Dept>(Dept.class));
		for (Dept dept : depts) {
			System.out.println(dept);
		}
		return depts;
	}

}
