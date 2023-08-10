package com.example.app.services;

import com.example.app.dtos.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto create(EmployeeDto employeeDto);
    List<EmployeeDto> getAll();

    EmployeeDto getById(long id);
    void deleteById(long id);

    EmployeeDto update(EmployeeDto employeeDto);
}
