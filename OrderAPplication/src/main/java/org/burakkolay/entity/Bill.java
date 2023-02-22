package org.burakkolay.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Bill extends Company{

    private double amount;
    private LocalDate billingDate;

    public Bill(String companyName, Category category) {
        super(companyName, category);
    }

    public Bill(int id, String companyName, Category category, double amount, LocalDate billingDate) {
        super(companyName, category);
        this.amount = amount;
        this.billingDate = billingDate;
    }

}
