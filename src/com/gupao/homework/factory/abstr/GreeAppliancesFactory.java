package com.gupao.homework.factory.abstr;

public class GreeAppliancesFactory implements IAppliancesFactory {

    @Override
    public IAirConditioning createColdAir() {
        return new GreeAirConditioning();
    }

    @Override
    public IFridge createFreezing() {
        return new GreeFridge();
    }
}
