package com.rd.account;

import com.opencsv.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AccountLoader2 {

    CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
    CSVReader reader = new CSVReader(new FileReader("data.csv"), ';');
}
