package com.sparta.wahdel;

public class RaindropCalculator {

    public static String calculate(int number) {
        if (number == 3) {
            return "Pling";
        } else if(number == 5) {
            return "Plang";
        } else {
            return "Plong";
        }
    }
}
