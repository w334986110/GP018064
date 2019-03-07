package com.gupao.homework.factory.model;

import com.gupao.homework.factory.IAppliances;

public class Midea implements IAppliances {
    @Override
    public String getFactoryName() {
        return "美的";
    }
}
