package com.sparta.wahdel;

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
}
