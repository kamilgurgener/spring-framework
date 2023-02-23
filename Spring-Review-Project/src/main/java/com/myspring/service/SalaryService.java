package com.myspring.service;

import com.myspring.model.Employee;
import com.myspring.repository.EmployeeRepository;
import com.myspring.repository.HoursRespository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SalaryService {

    private final EmployeeRepository employeeRepository;
    private final HoursRespository hoursRespository;

    public SalaryService(EmployeeRepository employeeRepository,HoursRespository hoursRespository) {
        this.employeeRepository = employeeRepository;
        this.hoursRespository = hoursRespository;
    }

    public void calculateSalary(Employee employee){
        System.out.println(hoursRespository.getHours()*employeeRepository.getHourlyRate(employee));

    }
}
