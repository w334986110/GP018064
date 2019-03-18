package com.gupao.homework.observer;

import com.google.common.eventbus.EventBus;

public class GperGuavaEvent {

    private static EventBus eventBus = new EventBus();

    public GperGuavaEvent() {
    }

    /**
     * 注册事件
     * @param object
     */
    public static void register(Object object){
        eventBus.register(object);
    }

    public static void post(Object object){
        eventBus.post(object);
    }

    /**
     * 注销
     * @param object
     */
    public static void unregister(Object object){
        eventBus.unregister(object);
    }
}
