package com.app.org;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component 
public class UserEventProcessor implements ApplicationListener<EmployeeEvent>{

    @Override
    public void onApplicationEvent(EmployeeEvent event) {
        EmployeeEvent employeeEvent=(EmployeeEvent) event;
        System.out.println("Employee"+employeeEvent.getEventType()+"With Details"+employeeEvent.getEmployee());
    }
    

}

