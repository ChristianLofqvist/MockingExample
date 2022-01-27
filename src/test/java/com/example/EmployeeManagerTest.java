package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class EmployeeManagerTest {

    @Test
    @DisplayName("Checking payEmployees should return correct number of employees")
    void payEmployeesShouldReturnNumberOfEmployees() {
        EmployeeManager employeeManager = new EmployeeManager(new EmployeeRepositoryStub(), new BankServiceStub());

        var result = employeeManager.payEmployees();

        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("payEmployees should catch RuntimeException")
    void payEmployeesShouldCatchRuntimeException() {
        EmployeeRepository employeeRepository = mock(EmployeeRepository.class);
        BankService bankService = mock(BankService.class);
        EmployeeManager employeeManager = new EmployeeManager(employeeRepository, bankService);
        doThrow(new RuntimeException()).when(bankService).pay("Test", 2.0);
        when(employeeRepository.findAll()).thenReturn(List.of(new Employee("Test", 2.0),
                new Employee("Test2", 3.0), new Employee("Test3", 4.0)));

        var result = employeeManager.payEmployees();
        var result1 = employeeRepository.findAll();

        assertThat(result).isEqualTo(2);
        assertThat(result1).hasSize(3);
    }
}