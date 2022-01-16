package com.company;

import com.company.readers.TextFileReader;
import com.company.services.ProcessData;

import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException {

        TextFileReader textFileReader = new TextFileReader("src/com/company/textFiles/inputDataFile");

        ProcessData processData = new ProcessData();
        processData.processData(textFileReader.getData());
    }
}
