package com.gupao.homework.single.lazy;

public class LazySimpleSingleton {

    private LazySimpleSingleton(){}

    private static LazySimpleSingleton lazySimpleSingleton = null;

    // 使用synchronized会影响性能
    public synchronized static LazySimpleSingleton getInstance(){
        if(lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
