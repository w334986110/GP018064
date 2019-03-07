package com.gupao.homework.factory.model;

import com.gupao.homework.factory.IAppliances;

public class Haier implements IAppliances {
    @Override
    public String getFactoryName() {
        return "海尔";
    }
}
