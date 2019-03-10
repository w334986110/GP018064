package com.gupao.homework.single.lazy;

public class LazyDoubleCheckSingleton {

    private LazyDoubleCheckSingleton(){}

    // 双检索本身受限于JVM执行顺序问题，这里加上volatile
    private volatile static LazyDoubleCheckSingleton lazy = null;

    // 双检索机制
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazy == null){
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }
}
