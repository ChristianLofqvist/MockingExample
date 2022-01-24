package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeManagerTest {

    @Test
    @DisplayName("Checking payEmployees should return correct number of employees")
    void payEmployeesShouldReturnNumberOfEmployees() {
        EmployeeManager employeeManager = new EmployeeManager(new EmployeeRepositoryStub(), new BankServiceStub());

        var result = employeeManager.payEmployees();

        assertThat(result).isEqualTo(3);
    }
}