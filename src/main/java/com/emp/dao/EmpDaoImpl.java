package com.emp.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.emp.model.Emp;
@Repository("empDao")
public class EmpDaoImpl implements EmpDao {
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Emp> getAllEmps() {
		// TODO Auto-generated method stub
		String sql="select * from emp";
		List<Emp> emps = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
//		List<Emp> emps =new ArrayList<Emp>();
		return emps;
	}

	@Override
	public void deleteEmpsByDeptNo(Integer dno) {
		// TODO Auto-generated method stub
		String sql="delete from emp where deptno=?";
		int res = jdbcTemplate.update(sql,dno);
		System.out.println(res);
		
	}

}
