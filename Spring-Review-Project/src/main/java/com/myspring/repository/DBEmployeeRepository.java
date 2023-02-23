package com.myspring.repository;

import com.myspring.model.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DBEmployeeRepository implements EmployeeRepository{


    @Override
    public int getHourlyRate(Employee emp1) {

        return emp1.getHourlyRate();
    }

}
