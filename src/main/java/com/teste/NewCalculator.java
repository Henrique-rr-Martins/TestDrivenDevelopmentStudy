package com.teste;

import java.util.Arrays;

public class NewCalculator {
    public static NewCalculator getInstance(){ return new NewCalculator(); }
    public Integer sum(Integer... values){ return Arrays.stream(values).mapToInt(value -> value).sum(); }
}