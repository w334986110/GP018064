package com.gupao.homework.observer;

import com.google.common.eventbus.Subscribe;

public class QuestionObserver {

    @Subscribe
    public void function(String teacher){
        String msg = teacher +  "老师，你好！你收到一个来自Gper生态圈的问题";
        System.out.println(msg);
    }
}
