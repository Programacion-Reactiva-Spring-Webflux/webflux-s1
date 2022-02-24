package com.lagm.webflux.repository;

import com.lagm.webflux.modelo.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, Integer> {
}
