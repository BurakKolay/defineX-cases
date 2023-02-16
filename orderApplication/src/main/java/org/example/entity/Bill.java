package org.example.entity;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class Bill {

    private int id;
    private LocalDate date;
    private double price;
    private String address;

}
