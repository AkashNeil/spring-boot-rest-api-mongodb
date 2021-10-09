package io.github.seebaware.springbootrestapimongodb;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@Document
public record Student(
        @Id String id,
        String firstName,
        String lastName,
        String email,
        Gender gender,
        Address address,
        List<String> favouriteSubjects,
        BigDecimal totalSpentInBooks,
        ZonedDateTime created) {

    /*private static String firstName;
    private static String lastName;
    private static String email;
    private static Gender gender;
    private static Address address;
    private static List<String> favouriteSubjects;
    private static BigDecimal totalSpentInBooks;
    private static ZonedDateTime created;*/

}
