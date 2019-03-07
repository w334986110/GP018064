package com.gupao.homework.factory.function;

import com.gupao.homework.factory.IAppliances;
import com.gupao.homework.factory.model.Midea;

public class MideaFacatory extends AbstractLogger implements IAppliancesFactory {
    @Override
    public IAppliances getWorkshopName() {
        beforeLog();
        return new Midea();
    }


    @Override
    void beforeLog() {
        System.out.println("我们生产");
    }
}
