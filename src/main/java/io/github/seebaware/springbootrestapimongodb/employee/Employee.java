package io.github.seebaware.springbootrestapimongodb.employee;

import io.github.seebaware.springbootrestapimongodb.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private Address address;
    private List<String> favouriteSubjects;
    private BigDecimal totalSpentInBooks;
    private LocalDateTime created;

    public Employee(String firstName, String lastName, String email, String gender, Address address, List<String> favouriteSubjects, BigDecimal totalSpentInBooks, LocalDateTime created) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.favouriteSubjects = favouriteSubjects;
        this.totalSpentInBooks = totalSpentInBooks;
        this.created = created;
    }
}
