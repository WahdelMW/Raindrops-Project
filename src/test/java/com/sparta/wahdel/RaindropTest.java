package com.sparta.wahdel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RaindropTest {

    @Test
    public void returnPling() {
        String result = RaindropCalculator.calculate(3);
        Assertions.assertEquals("Pling", result);
    }
}
