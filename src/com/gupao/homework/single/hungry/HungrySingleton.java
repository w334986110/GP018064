package com.gupao.homework.single.hungry;

public class HungrySingleton {

    // 要用final，防止通过反射改变实例
    private static final HungrySingleton singleton = new HungrySingleton();

    // 单例模式的特征之一就是隐藏构造函数
    private HungrySingleton (){}

    public static HungrySingleton getInstance (){
        return singleton;
    }
}
