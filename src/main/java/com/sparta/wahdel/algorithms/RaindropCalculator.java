package com.sparta.wahdel.algorithms;

public class RaindropCalculator {

    public static String calculate(int number) {
        String result = "";
        Boolean isRaindrop = false;
        if (number % 3 == 0) {
            isRaindrop = true;
            result += "Pling";
        }
        if (number % 5 == 0) {
            isRaindrop = true;
            result += "Plang";
        }
        if (number % 7 == 0) {
            isRaindrop = true;
            result += "Plong";
        }
        if (!isRaindrop) {
            result = String.valueOf(number);
        }
        return result;
    }
}
