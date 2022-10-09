package com.rd.account;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "data.csv";
        AccountLoader list = new AccountLoader();
        List<Account> accList = list.loadFile(filename);
        System.out.println(accList);
    }
}