package io.github.seebaware.springbootrestapimongodb.employee;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

    Optional<Employee> findEmployeeByEmail(String email);

}
