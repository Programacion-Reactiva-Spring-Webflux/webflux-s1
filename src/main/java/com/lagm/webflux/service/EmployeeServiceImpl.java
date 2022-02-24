package com.lagm.webflux.service;

import com.lagm.webflux.modelo.Employee;
import com.lagm.webflux.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.save(employee).subscribe();
    }

    @Override
    public Mono<Employee> findByEmployeeId(Integer id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Flux<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Mono<Employee> updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Mono<Void> deleteEmployee(Integer id) {
        return employeeRepository.deleteById(id);
    }
}
