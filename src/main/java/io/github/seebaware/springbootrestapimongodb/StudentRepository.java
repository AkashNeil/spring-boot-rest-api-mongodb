package io.github.seebaware.springbootrestapimongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<String, Student> {

    

}
