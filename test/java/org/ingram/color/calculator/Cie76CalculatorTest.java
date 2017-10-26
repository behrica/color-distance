package org.ingram.color.calculator;

import org.ingram.color.space.RgbColorSpace;
import org.junit.Test;

import static org.junit.Assert.*;

public class Cie76CalculatorTest {
    @Test
    public void distance() throws Exception {
        Cie76Calculator cie76Calculator=new Cie76Calculator();
        assertEquals(100,
                cie76Calculator.distance(new RgbColorSpace(0,0,0),
                                 new RgbColorSpace(255,255,255)),
                0.01);

    }

}