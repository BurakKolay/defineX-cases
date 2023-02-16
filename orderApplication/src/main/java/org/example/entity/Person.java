package org.example.entity;

import lombok.Data;

@Data
public class Person extends Customer{

    private String identificationNumber;
    private String firstName;
    private String lastName;

    public Person(String identificationNumber, String firstName, String lastName) {
        this.identificationNumber = identificationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
