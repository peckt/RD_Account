package com.rd.account;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "data2.csv";
        AccountLoader list = new AccountLoader();
        List<Account> accList = list.loadFile(filename);
        accList.forEach( (n) -> { System.out.println(n); } );
    }
}