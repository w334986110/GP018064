package com.gupao.homework.factory.abstr;

import com.gupao.homework.factory.IAppliances;
import com.gupao.homework.factory.model.Gree;
import com.gupao.homework.factory.model.Haier;
import com.gupao.homework.factory.model.Midea;

public class AppliancesFactory extends AbstractFactory {
    @Override
    public IAppliances getGree() {
        return new Gree();
    }

    @Override
    public IAppliances getHaier() {
        return new Haier();
    }

    @Override
    public IAppliances getMidea() {
        return new Midea();
    }
}
