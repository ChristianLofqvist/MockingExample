package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeRepositoryImplTest {
    @Test
    @DisplayName("findAll should return a list")
    void findAllShouldReturnAList() {
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

        var result = employeeRepository.findAll();

        assertThat(result).isInstanceOf(List.class);
    }

    @Test
    @DisplayName("save should add to list")
    void saveShouldAddToList() {
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        Employee employee = new Employee("Test", 2.0f);

        employeeRepository.save(employee);
        var result = employeeRepository.findAll();

        assertThat(result).contains(employee);
    }

    @Test
    @DisplayName("constructor should add employees to list")
    void constructorShouldAddEmployeesToList() {
        Employee employee = new Employee("Test", 2.0f);
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl(List.of(employee));

        var result = employeeRepository.findAll();

        assertThat(result).contains(employee);
    }

    @Test
    @DisplayName("save should replace existing employee with new one if same ID")
    void saveShouldReplaceEmployee() {
        Employee employee = new Employee("Test", 2.0f);
        Employee employee1 = new Employee("Test", 3.0f);
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

        employeeRepository.save(employee);
        employeeRepository.save(employee1);
        var result = employeeRepository.findAll();

        assertThat(result).containsOnly(employee1);
    }
}