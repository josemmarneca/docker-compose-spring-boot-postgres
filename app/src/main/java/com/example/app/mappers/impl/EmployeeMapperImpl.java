package com.example.app.mappers.impl;


import com.example.app.database.entities.Employee;
import com.example.app.dtos.EmployeeDto;
import com.example.app.mappers.EmployeeMapper;


public class EmployeeMapperImpl implements EmployeeMapper {
    @Override
    public EmployeeDto convertEntityToDto(Employee employee) {
        if (employee == null ) {
            return null;
        }
        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setName( employee.getName() );
        employeeDto.setEmail( employee.getName() );
        return employeeDto;
    }

    @Override
    public Employee convertDtoToEntity(EmployeeDto employeeDto) {
        if (employeeDto == null ) {
            return null;
        }
        Employee employee = new Employee();
        employee.setName(employee.getName());
        employee.setEmail(employee.getEmail());
        return employee;
    }
}
