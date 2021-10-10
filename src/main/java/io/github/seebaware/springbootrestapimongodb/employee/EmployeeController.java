package io.github.seebaware.springbootrestapimongodb.employee;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping(
            "/findAll"
    )
    public List<Employee> findAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping(
            path="/create"
    )
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

}
