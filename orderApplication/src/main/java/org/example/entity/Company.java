package org.example.entity;

import lombok.Data;

@Data
public class Company extends Customer{

    private String tax;
    private String companyName;

    public Company(String tax, String companyName) {
        this.tax = tax;
        this.companyName = companyName;
    }
}
