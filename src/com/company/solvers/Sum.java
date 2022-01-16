package com.company.solvers;

public class Sum implements Strategy {

    @Override
    public String solution(String line) {
        int sum = 0;
        String[] values = line.split(" ");
        for (String s : values) {
            try{
                sum += Integer.parseInt(s);
            }catch (NumberFormatException e){
                System.out.println("I can't sum words");
                return "0";
            }
        }
        return Integer.toString(sum);
    }


}
