package com.rbcamelbootjetty;

import java.util.Collections;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class EmployeeSerivce {
	
	private static Map<String, Employee> emps;
	
	public static void setDefaultEmployee(){
		emps = Collections.emptyMap();
		emps.put("abc", getDefaultEmp());
	}

	public Employee getEmployee(String id){
		System.out.println("Get employee: "+ id);
		return emps.get(id);
		
	}
	
	public void createEmployee(Employee e){
		emps.put(e.getId(), e);
	}
	
	public void deleteEmployee(String id){
		emps.remove(id);
	}
	
	private static Employee getDefaultEmp(){
		Employee emp = new Employee();
		emp.setId("abc");
		emp.setFname("ABC");
		emp.setLname("xyz");
		emp.setDoj("10dec1978");
		emp.setTitle("Dir");
		emp.setSalary("999K");
		
		return emp;
	}
}
