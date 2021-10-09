package io.github.seebaware.springbootrestapimongodb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class SpringbootRestApiMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestApiMongodbApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(StudentRepository studentRepository) {
        return args -> {

            Address address = new Address(
              "England",
              "London",
              "NE7"
            );

          Student student = new Student(
                  "David",
                  "Shearer",
                  "david@email.com",
                  Gender.MALE,
                  address,
                  List.of("Computer Science"),
                  BigDecimal.TEN,
                  LocalDateTime.now()
          );

          studentRepository.insert(student);

        };
    }

}
