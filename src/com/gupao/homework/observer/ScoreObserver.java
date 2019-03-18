package com.gupao.homework.observer;

import com.google.common.eventbus.Subscribe;

public class ScoreObserver {

    @Subscribe
    public void function(Integer score){
        System.out.println("直播课程评分："+score);
    }
}
