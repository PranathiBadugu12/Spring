package com.app.org;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeCRUDAspect {
	
	@Pointcut("execution(* com.app.org.Employee.getSalary(..))")
	private void selectedGetSalary() {
		System.out.println("sleectedGetSalary is called");
	}
	@Before("selectedGetSalary()")
	public void beforeAdvice() {
		System.out.println("Before advice is called");
	}
	
}
