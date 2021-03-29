package com.sparta.wahdel;

import com.sparta.wahdel.algorithms.RaindropCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RaindropTest {

    @Test
    public void returnPling() {
        String result = RaindropCalculator.calculate(3);
        Assertions.assertEquals("Pling", result);
    }

    @Test
    public void returnPlang() {
        String result = RaindropCalculator.calculate(5);
        Assertions.assertEquals("Plang", result);
    }

    @Test
    public void returnPlong() {
        String result = RaindropCalculator.calculate(7);
        Assertions.assertEquals("Plong", result);
    }

    @Test
    public void returnNumber() {
        String result = RaindropCalculator.calculate(34);
        Assertions.assertEquals("34", result);
    }
}
