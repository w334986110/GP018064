package com.gupao.homework.factory.abstr;

public class HaierAppliancesFactory implements IAppliancesFactory {

    @Override
    public IAirConditioning createColdAir() {
        return new HaierAirConditioning();
    }

    @Override
    public IFridge createFreezing() {
        return new HaierFridge();
    }
}
