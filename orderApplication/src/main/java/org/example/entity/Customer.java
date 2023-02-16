package org.example.entity;

import lombok.Data;

import java.util.List;

@Data
public class Customer {

    private List<Order> orders;
    private List<Bill> bills;

}
