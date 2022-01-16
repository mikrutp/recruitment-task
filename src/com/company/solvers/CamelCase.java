package com.company.solvers;

import java.util.Locale;

public class CamelCase implements Strategy {
    @Override
    public String solution(String line) {
        StringBuilder sb = new StringBuilder();
        line = line.toLowerCase(Locale.ROOT);
        String[] values = line.split(" ");
        sb.append(values[0]);
        for (int i = 1; i < values.length; i++) {
            String firstLetter = values[i].substring(0, 1).toUpperCase(Locale.ROOT);
            String restOfWord = values[i].substring(1);
            sb.append(firstLetter);
            sb.append(restOfWord);
        }
        return sb.toString();
    }
}
