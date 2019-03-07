package com.gupao.homework.factory.abstr;

import com.gupao.homework.factory.IAppliances;

public abstract class AbstractFactory {

    abstract IAppliances getGree();
    abstract IAppliances getHaier();
    abstract IAppliances getMidea();
}
