package com.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
	
	@GetMapping("1")
	public String showMessage1()
	{
		return "Welcome to Rest API";
	}
	
	@GetMapping("2")
	public String showMessage2()
	{
		return "Minku";
	}

}
