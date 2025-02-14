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

    @Test
    @DisplayName("getSalary should return salary")
    void getSalaryShouldReturnSalary() {
        Employee employee = new Employee("test", 200);

        var result = employee.getSalary();

        assertThat(result).isEqualTo(200);
    }

    @Test
    @DisplayName("setId should set ID")
    void setIdShouldSetId() {
        Employee employee = new Employee("test", 200);

        employee.setId("test2");
        var result = employee.getId();

        assertThat(result).isEqualTo("test2");
    }

    @Test
    @DisplayName("setSalary should set salary")
    void setSalaryShouldSetSalary() {
        Employee employee = new Employee("test", 200);

        employee.setSalary(300);
        var result = employee.getSalary();

        assertThat(result).isEqualTo(300);
    }

    @Test
    @DisplayName("isPaid should return false")
    void isPaidShouldReturnFalse() {
        Employee employee = new Employee("test", 200);

        var result = employee.isPaid();

        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("setPaid should set payment")
    void setPaidShouldSetPayment() {
        Employee employee = new Employee("test", 200);

        employee.setPaid(true);
        var result = employee.isPaid();

        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("toString should return ID and salary")
    void toStringShouldReturnIdAndSalary() {
        Employee employee = new Employee("test", 200);

        var result = employee.toString();

        assertThat(result).isEqualTo("Employee [id=test, salary=200.0]");
    }
}
