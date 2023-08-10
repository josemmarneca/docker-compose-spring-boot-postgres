package com.example.app.services.impl;

import com.example.app.database.entities.Employee;
import com.example.app.database.repositories.EmployeeRepository;
import com.example.app.dtos.EmployeeDto;
import com.example.app.exception.ResourceInvalidException;
import com.example.app.exception.ResourceNotFoundException;
import com.example.app.mappers.EmployeeMapper;
import com.example.app.services.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl  implements EmployeeService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDto create(EmployeeDto employeeDto) {
        if(!Objects.isNull(employeeDto.getId())){
            throw new ResourceInvalidException("Not accept Id in create");
        }

        Employee employee = EmployeeMapper.INSTANCE.convertDtoToEntity(employeeDto);
        employee = this.employeeRepository.save(employee);
        return EmployeeMapper.INSTANCE.convertEntityToDto(employee);

    }

    @Override
    public List<EmployeeDto> getAll() {
        List<Employee> employeeList = this.employeeRepository.findAll();
        return employeeList.stream().map(EmployeeMapper.INSTANCE::convertEntityToDto)
                .collect(Collectors.toList());

    }

    @Override
    public EmployeeDto getById(long id) {
        Employee employee = this.employeeRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
        return EmployeeMapper.INSTANCE.convertEntityToDto(employee);
    }

    @Override
    public void deleteById(long id) {
        logger.debug("Delete Employee by id" + id);
        this.employeeRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
        logger.debug("Employee exist delete them");
        employeeRepository.deleteById(id);
    }

    @Override
    public EmployeeDto update(EmployeeDto employeeDto) {
        logger.debug("Update Employee by id" + employeeDto.getId());
        Employee employee = this.employeeRepository.findById(employeeDto.getId()).
                orElseThrow(() -> new ResourceNotFoundException("Employee", "id", employeeDto.getId()));
        employee.setEmail(employeeDto.getEmail());
        employee.setName(employee.getName());
        logger.debug("Employee exist update them");
        employee = this.employeeRepository.save(employee);
        return EmployeeMapper.INSTANCE.convertEntityToDto(employee);
    }
}
