package com.cg.springmvcone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.springmvcone.dao.IEmployeeDao;
import com.cg.springmvcone.dto.Employee;



@Service("employeeservice")
@Transactional
public class EmployeeServiceImpl implements IEmployeeService{
	@Autowired
	IEmployeeDao employeedao;
	@Override
	public int addEmployeeData(Employee emp) {
		// TODO Auto-generated method stub
		return employeedao.addEmployeeData(emp);
	}

	@Override
	public List<Employee> showAllEmployee() {
		// TODO Auto-generated method stub
		return employeedao.showAllEmployee();
	}

	@Override
	public void deleteEmployee(int empId) {
		 employeedao.deleteEmployee(empId);
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		return employeedao.searchEmployee(id);
	}
	

}
