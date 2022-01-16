package com.company.services;

import java.util.List;

public class ProcessData {

    public void processData(List<String> listToProcess) {


        StrategyPickerAndSolveOrder strategyPickerAndSolveOrder = new StrategyPickerAndSolveOrder();

        for (String toProcess : listToProcess) {
            strategyPickerAndSolveOrder.processStrategy(toProcess);
        }
    }
}
