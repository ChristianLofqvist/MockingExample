package com.example;

import java.util.List;

public class EmployeeRepositoryStub implements EmployeeRepository {
    @Override
    public List<Employee> findAll() {
        return List.of(new Employee("Test", 2.0f), new Employee("Test2", 3.0f), new Employee("Test3", 4.0f));
    }

    @Override
    public Employee save(Employee e) {
        return null;
    }
}
