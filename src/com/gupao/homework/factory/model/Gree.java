package com.gupao.homework.factory.model;

import com.gupao.homework.factory.IAppliances;

public class Gree implements IAppliances {
    @Override
    public String getFactoryName() {
        return "格力";
    }
}
