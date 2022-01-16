package com.company.readers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileReader implements ReaderInterface {

    String filePath;

    public TextFileReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<String> getData() throws IOException {
        List<String> linesList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = br.readLine()) != null) {
            linesList.add(line);
        }
        return linesList;
    }
}
