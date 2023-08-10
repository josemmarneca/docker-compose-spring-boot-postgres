package com.example.app.mappers;


import com.example.app.database.entities.Employee;
import com.example.app.dtos.EmployeeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    EmployeeDto convertEntityToDto(Employee employee);

    Employee convertDtoToEntity(EmployeeDto employeeDto);

}
