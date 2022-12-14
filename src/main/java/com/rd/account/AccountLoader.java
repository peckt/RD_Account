package com.rd.account;
import lombok.Setter;
import lombok.Getter;
import java.io.*;
import java.net.URL;
import java.util.*;

@Setter
@Getter
public class AccountLoader {
    public List<Account> loadFile(String fName) {
        String delimiter = ";";
        //get path
        URL url = getClass().getClassLoader().getResource(fName);
        List<Account> tempList = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(url.getPath()))) {
            while (scanner.hasNextLine()) {
                String data[] = scanner.nextLine().split(delimiter);
                tempList.add(new Account(Integer.parseInt(data[0]), Double.parseDouble(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4])));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return tempList;
    }
}
