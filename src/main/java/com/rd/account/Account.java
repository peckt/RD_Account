package com.rd.account;
import lombok.*;
import java.time.LocalDate;

@Data
public class Account {

    private int number;
    private double balance;
    private LocalDate bDate;
    public Account(int number, double balance, int year, int month, int day) {
        super();
        this.number = number;
        this.balance = balance;
        this.bDate = LocalDate.of(year, month, day);
    }
   @Override
   public String toString() {
        return "[Account number=" + this.number + ", balance=$" + this.balance + ", balanceDate=" + this.bDate + "]";
    }

}


