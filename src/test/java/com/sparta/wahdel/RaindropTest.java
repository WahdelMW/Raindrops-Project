package com.sparta.wahdel;

import com.sparta.wahdel.algorithms.RaindropCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RaindropTest {
    String result;

    @Test
    public void returnPling() {
        result = RaindropCalculator.calculate(3);
        assertEquals("Pling", result);
    }

    @Test
    public void returnPlang() {
        result = RaindropCalculator.calculate(5);
        assertEquals("Plang", result);
    }

    @Test
    public void returnPlong() {
        result = RaindropCalculator.calculate(7);
        assertEquals("Plong", result);
    }

    @Test
    public void returnNumber() {
        result = RaindropCalculator.calculate(34);
        assertEquals("34", result);
    }

    @Test
    public void returnPlingForMultiplesOf3() {
        result = RaindropCalculator.calculate(6);
        assertEquals("Pling", result);
    }

    @Test
    public void returnPlangForMultiplesOf5() {
        result = RaindropCalculator.calculate(10);
        assertEquals("Plang", result);
    }

    @Test
    public void returnPlongForMultiplesOf7() {
        result = RaindropCalculator.calculate(14);
        assertEquals("Plong", result);
    }

    @Test
    public void returnPlingPlangForMultiplesOf3And5() {
        result = RaindropCalculator.calculate(30);
        assertEquals("PlingPlang", result);
    }

    @Test
    public void returnPlingPlongForMultiplesOf3And7() {
        result = RaindropCalculator.calculate(21);
        assertEquals("PlingPlong", result);
    }

    @Test
    public void returnPlangPlongForMultiplesOf5And7() {
        result = RaindropCalculator.calculate(35);
        assertEquals("PlangPlong", result);
    }

    @Test
    public void returnPlingPlangPlongForMultiplesOf3And5And7() {
        result = RaindropCalculator.calculate(105);
        assertEquals("PlingPlangPlong", result);
    }

    @Test
    public void testForInput0() {
        result = RaindropCalculator.calculate(0);
        assertEquals("PlingPlangPlong", result);
    }

    @Test
    public void testForNegativeInput() {
        result = RaindropCalculator.calculate(-70);
        assertEquals("PlangPlong", result);
    }

    @Test
    public void testForMaxIntegerInput() {
        result = RaindropCalculator.calculate(Integer.MAX_VALUE);
        assertEquals(String.valueOf(Integer.MAX_VALUE), result);
    }

    @Test
    public void testForMinIntegerInput() {
        result = RaindropCalculator.calculate(Integer.MIN_VALUE);
        assertEquals(String.valueOf(Integer.MIN_VALUE), result);
    }
}
