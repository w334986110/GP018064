package com.gupao.homework.factory.abstr;

public class MideaAppliancesFactory implements IAppliancesFactory {

    @Override
    public IAirConditioning createColdAir() {
        return new MideaAirConditioning();
    }

    @Override
    public IFridge createFreezing() {
        return new MideaFridge();
    }
}
