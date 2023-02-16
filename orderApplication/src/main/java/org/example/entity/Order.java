package org.example.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Order {

    private int id;
    private LocalDate date;
    private double price;
    private String address;
}
