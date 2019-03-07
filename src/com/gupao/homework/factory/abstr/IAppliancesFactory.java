package com.gupao.homework.factory.abstr;

public interface IAppliancesFactory {

    IAirConditioning createColdAir();

    IFridge createFreezing();
}
