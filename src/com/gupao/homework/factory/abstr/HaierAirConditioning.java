package com.gupao.homework.factory.abstr;

public class HaierAirConditioning implements IAirConditioning {
    @Override
    public void cold() {
        System.out.println("海尔空调");
    }
}
