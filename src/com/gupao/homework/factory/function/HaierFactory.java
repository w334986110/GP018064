package com.gupao.homework.factory.function;

import com.gupao.homework.factory.IAppliances;
import com.gupao.homework.factory.model.Haier;

public class HaierFactory extends AbstractLogger implements IAppliancesFactory {
    @Override
    public IAppliances getWorkshopName() {
        beforeLog();
        return new Haier();
    }

    @Override
    void beforeLog() {
        System.out.println("我们来自");
    }
}
