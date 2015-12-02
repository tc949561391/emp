package com.emp.webcontroller;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emp.model.Dept;
import com.emp.model.Emp;
import com.emp.service.DeptService;
import com.emp.service.EmpService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Resource
	private EmpService empService;
	@Resource
	private DeptService deptService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("controller", "home");
		List<Emp> emps = empService.getAllEmps();
		List<Dept> depts = deptService.getAllDepts();
		model.addAttribute("emps", emps);
		model.addAttribute("depts", depts);
		return "home";
	}
	@RequestMapping(value = "/detedept", method = RequestMethod.GET)
	public String deteDept(Integer deptno){
		System.out.println(deptno);
		deptService.deleteDept(deptno);
		
		
		  return "redirect:/";
	}

}
