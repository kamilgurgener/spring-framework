package com.myspring.repository;

import com.myspring.model.Employee;

public interface EmployeeRepository {


    int getHourlyRate(Employee employee);
}
