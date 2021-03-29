package com.sparta.wahdel.algorithms;

public class RaindropCalculator {

    public static String calculate(int number) {
        String result;
        if (number % 3 == 0) {
            result = "Pling";
        } else if (number == 5) {
            result = "Plang";
        } else if (number == 7) {
            result = "Plong";
        } else {
            result = String.valueOf(number);
        }
        return result;
    }
}
