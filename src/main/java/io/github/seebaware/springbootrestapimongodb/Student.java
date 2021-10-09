package io.github.seebaware.springbootrestapimongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Document
public record Student(
        @Id
        String id,
        String firstName,
        String lastName,
        @Indexed(unique = true)
        String email,
        Gender gender,
        Address address,
        List<String> favouriteSubjects,
        BigDecimal totalSpentInBooks,
        LocalDateTime created) {

    public Student(String firstName, String lastName, String email, Gender gender, Address address, List<String> favouriteSubjects, BigDecimal totalSpentInBooks, LocalDateTime created) {
        this(null, firstName, lastName, email, gender, address, favouriteSubjects, totalSpentInBooks, created);
    }

}
