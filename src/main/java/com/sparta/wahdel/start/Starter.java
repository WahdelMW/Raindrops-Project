package com.sparta.wahdel.start;

import com.sparta.wahdel.utils.Printer;
import com.sparta.wahdel.algorithms.RaindropCalculator;

public class Starter {

    public static void start() {
        Printer.printMessage(RaindropCalculator.calculate(27));
        Printer.printMessage(RaindropCalculator.calculate(60));
        Printer.printMessage(RaindropCalculator.calculate(210));
        Printer.printMessage(RaindropCalculator.calculate(998));
    }
}
