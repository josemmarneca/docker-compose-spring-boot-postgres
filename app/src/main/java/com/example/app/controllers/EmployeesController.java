package com.example.app.controllers;

import com.example.app.services.impl.EmployeeServiceImpl;
import com.example.app.dtos.EmployeeDto;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeesController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final EmployeeServiceImpl employeeService;

    public EmployeesController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<HttpStatus> create(@RequestBody EmployeeDto employee) {
        logger.info("START Employee created ");

        EmployeeDto employeeDto = employeeService.create(employee);
        logger.info("Employee created id: " + employeeDto.getId());
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @GetMapping(value ="/{id}")
    public ResponseEntity<EmployeeDto> getUserById(@PathVariable("id") Long employeeId){
        EmployeeDto employeeDto = employeeService.getById(employeeId);
        return new ResponseEntity<>(employeeDto, HttpStatus.OK);
    }

    @GetMapping(value ="/all")
    public ResponseEntity<List<EmployeeDto>> getAll(){
        logger.info("START Employee get All ");
        List<EmployeeDto> employeeDtoList = employeeService.getAll();
        return new ResponseEntity<>(employeeDtoList, HttpStatus.OK);
    }

    @PutMapping(value ="/{id}")
    public ResponseEntity<EmployeeDto> updateUser(@PathVariable("id") Long employeeId,
                                              @RequestBody @Valid EmployeeDto employeeDto){
        employeeDto.setId(employeeId);
        EmployeeDto updatedEmployee = employeeService.update(employeeDto);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long employeeId){
        employeeService.deleteById(employeeId);
        return new ResponseEntity<>("Employee successfully deleted!", HttpStatus.OK);
    }

}
