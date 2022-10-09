package com.rd.account;
import lombok.Data;
import java.time.LocalDate;

@Data
public class Account {
    private int number;
    private double balance;
    private LocalDate bDate;
    public Account(int number, double balance, int year, int month, int day) {
        this.number = number;
        this.balance = balance;
        this.bDate = LocalDate.of(year, month, day);
    }
}


