package com.myspring;

import com.myspring.config.AppConfig;
import com.myspring.model.Employee;
import com.myspring.service.SalaryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {


    public static void main(String[] args) {
        Employee employee =new Employee();
        employee.setHourlyRate(25);

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SalaryService salaryService = context.getBean(SalaryService.class);
        salaryService.calculateSalary(employee);

    }



}
