package com.teste;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void sum() {
        Calculator calc = Calculator.getInstance();
        Integer sum = calc.sum("1+1+3+1");
        System.out.println(sum);
        assertEquals(6, sum);
    }

    @Test
    public void testeSomarComMock(){
        var calc = mock(Calculator.class);

        when(calc.sum("1+2")).thenReturn(10);
        Integer resultado = calc.sum("1+2");

        assertEquals(10, resultado);
    }
}