package io.github.seebaware.springbootrestapimongodb;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Log
@SpringBootApplication
public class SpringbootRestApiMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestApiMongodbApplication.class, args);
    }

    /*@Bean
    CommandLineRunner runner(StudentRepository studentRepository, MongoTemplate mongoTemplate) {
        return args -> {

            Address address = new Address(
              "England",
              "London",
              "NE7"
            );

            String email = "hello@email.com";

          Student student = new Student(
                  "David",
                  "Shearer",
                  email,
                  Gender.MALE,
                  address,
                  List.of("Computer Science"),
                  BigDecimal.TEN,
                  LocalDateTime.now()
          );

           usingMongoTemplateAndQuery(studentRepository, mongoTemplate, email, student);


        };
    }

    private void usingMongoTemplateAndQuery(StudentRepository studentRepository, MongoTemplate mongoTemplate, String email, Student student) {
        Query query = new Query();
        query.addCriteria(Criteria.where("email").is(email));

        List<Student> students = mongoTemplate.find(query, Student.class);

        if (students.size() > 1) {
            throw new IllegalStateException(
                    "found many students with email " + email
            );
        }

        if (students.isEmpty()) {
            studentRepository.insert(student);
        } else {
            log.info(student + " already exists.");
        }
    }*/

}
