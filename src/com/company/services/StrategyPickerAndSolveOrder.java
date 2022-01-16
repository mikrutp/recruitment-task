package com.company.services;

import com.company.solvers.*;
import com.company.writers.ConsoleWriter;
import com.company.writers.WriterInterface;

public class StrategyPickerAndSolveOrder {

    Strategy strategy = null;
    WriterInterface consoleWriter = new ConsoleWriter();

    public void processStrategy(String line){
        switch (line) {
            case "SUM":
                strategy = new Sum();
                break;
            case "REVERSE":
                strategy = new Reverse();
                break;
            case "CC":
                strategy = new CamelCase();
                break;
            case "ORDER":
                strategy = new Order();
                break;
            default:
                if (strategy != null) {
                    consoleWriter.write(strategy.solution(line));
                } else {
                    System.out.println("Strategy is not chosen so i don't know what to do with line = " + line);
                }
                break;
        }

    }




}
