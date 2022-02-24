package com.lagm.webflux.controller;

import com.lagm.webflux.modelo.Employee;
import com.lagm.webflux.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create/emp")
    @ResponseStatus(HttpStatus.CREATED)
    private void createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
    }

    @GetMapping(value = "/get/all", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseStatus
    private Flux<Employee> findAllEmployee() {
        return employeeService.findAllEmployee();
    }

    @GetMapping(value = "/get/{id}")
    @ResponseStatus
    private ResponseEntity<Mono<Employee>> findEmployeeById(@PathVariable("id") Integer id) {
        Mono<Employee> employeeMono = employeeService.findByEmployeeId(id);
        return new ResponseEntity<Mono<Employee>>(employeeMono, employeeMono != null ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
}
