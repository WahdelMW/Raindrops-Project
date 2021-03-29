package com.sparta.wahdel.algorithms;

public class RaindropCalculator {

    public static String calculate(int number) {
        if (number == 3) {
            return "Pling";
        } else if (number == 5) {
            return "Plang";
        } else if (number == 7) {
            return "Plong";
        } else {
            return String.valueOf(number);
        }
    }
}
