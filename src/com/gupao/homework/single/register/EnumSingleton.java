package com.gupao.homework.single.register;

public enum EnumSingleton {

    INSTANCE;

    private EnumSingleton(){};

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
