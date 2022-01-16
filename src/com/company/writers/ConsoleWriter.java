package com.company.writers;

public class ConsoleWriter implements WriterInterface{
    @Override
    public void write(String answer){
        System.out.println(answer);
    }
}
