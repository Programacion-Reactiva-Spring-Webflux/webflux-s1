package com.lagm.webflux.service;

import com.lagm.webflux.modelo.Employee;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {
    void createEmployee(Employee employee);
    Mono<Employee> findByEmployeeId(Integer id);
    Flux<Employee> findAllEmployee();
    Mono<Employee> updateEmployee(Employee employee);
    Mono<Void> deleteEmployee(Integer id);
}
