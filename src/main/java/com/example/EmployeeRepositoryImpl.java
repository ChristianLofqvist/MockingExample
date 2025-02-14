package com.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final List<Employee> employeeList;

    public EmployeeRepositoryImpl() {
        this.employeeList = new ArrayList<>();
    }

    public EmployeeRepositoryImpl(List<Employee> employeeList) {
        this.employeeList = new ArrayList<>(employeeList);
    }

    @Override
    public List<Employee> findAll() {
        return employeeList;
    }

    @Override
    public Employee save(Employee e) {
        employeeList.stream().filter(employee -> employee.getId()
                        .equals(e.getId()))
                .findAny()
                .ifPresent(this::removeExistingEmployee);
        employeeList.add(e);
        return e;
    }

    private void removeExistingEmployee(Employee employee) {
        employeeList.remove(employee);
    }
}
