package com.gupao.homework.factory.function;

import com.gupao.homework.factory.IAppliances;
import com.gupao.homework.factory.model.Gree;

public class GreeFactory extends AbstractLogger implements IAppliancesFactory {
    @Override
    public IAppliances getWorkshopName() {
        beforeLog();
        return new Gree();
    }

    @Override
    void beforeLog() {
        System.out.println("欢迎来到");
    }
}
