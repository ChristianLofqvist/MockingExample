package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeTest {

    @Test
    @DisplayName("getId should return ID")
    void getIdShouldReturnId() {
        Employee employee = new Employee("test", 200);

        var result = employee.getId();

        assertThat(result).isEqualTo("test");
    }
}
