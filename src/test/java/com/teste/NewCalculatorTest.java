package com.teste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NewCalculatorTest {

    @Test
    public void deveSomarDoisValores(){
        Integer n1 = 1,
                n2 = 2;
        var calc = NewCalculator.getInstance();
        assertEquals(3, calc.sum(n1, n2));
    }

    @Test
    public void deveSomarTresValores(){
        Integer n1 = 1,
                n2 = 2,
                n3 = 3;
        var calc = NewCalculator.getInstance();
        assertEquals(6, calc.sum(n1, n2, n3));
    }
}
