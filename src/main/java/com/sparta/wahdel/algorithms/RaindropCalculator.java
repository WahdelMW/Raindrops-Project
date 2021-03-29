package com.sparta.wahdel.algorithms;

public class RaindropCalculator {

    public static String calculate(int number) {
        String result = "";
        boolean isRaindrop = false;
        if (isMultiple(number, 3)) {
            isRaindrop = true;
            result += "Pling";
        }

        if (isMultiple(number, 5)) {
            isRaindrop = true;
            result += "Plang";
        }

        if (isMultiple(number, 7)) {
            isRaindrop = true;
            result += "Plong";
        }

        if (!isRaindrop) {
            result = String.valueOf(number);
        }
        return result;
    }

    private static boolean isMultiple(int number, int i) {
        return number % i == 0;
    }
}
