package com.teste;

import java.util.Arrays;

public class Calculator {
    public static Calculator getInstance(){ return new Calculator(); }

    public Integer sum(String expression){
        return Arrays.stream(expression.split("\\+")).mapToInt(Integer::parseInt).sum();
    }
}
