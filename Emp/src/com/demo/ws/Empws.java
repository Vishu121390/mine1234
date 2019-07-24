package com.demo.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class Empws {
	@WebMethod
public String saveEmp(Emp e) {
	System.out.println("Employee saved succesfully");
	return e.getId()+ " "+ e.getName() + " " +e.getCity()+ " " + e.getSalary();
	
}
}
