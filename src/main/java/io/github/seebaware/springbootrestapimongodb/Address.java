package io.github.seebaware.springbootrestapimongodb;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record Address(String country,
                      String city,
                      String postCode) {

    /*
    private String country;
    private String city;
    private String postCode;
    */

}
