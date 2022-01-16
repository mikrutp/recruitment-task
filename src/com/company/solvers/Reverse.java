package com.company.solvers;

public class Reverse implements Strategy {
    @Override
    public String solution(String line) {
        StringBuilder sb = new StringBuilder(line);
        sb.reverse();
        return sb.toString();
    }
}
