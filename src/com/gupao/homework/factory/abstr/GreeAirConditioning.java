package com.gupao.homework.factory.abstr;

public class GreeAirConditioning implements IAirConditioning {
    @Override
    public void cold() {
        System.out.println("格力空调");
    }
}
