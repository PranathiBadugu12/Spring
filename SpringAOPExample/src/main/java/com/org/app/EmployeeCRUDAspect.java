package com.org.app;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeCRUDAspect {
	@Before("execution(* EmployeeManager.getEmployeeDetails())")
	public void longBeforeV1(JoinPoint jointpoint) {
		System.out.println("Method before actual execution");
	}
	
}
