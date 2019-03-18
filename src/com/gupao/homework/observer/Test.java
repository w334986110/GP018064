package com.gupao.homework.observer;

import com.google.common.eventbus.EventBus;

public class Test {

    public static void main(String[] args) {
        QuestionObserver questionObserver = new QuestionObserver();
        ScoreObserver scoreObserver = new ScoreObserver();

        GperGuavaEvent.register(questionObserver);
        GperGuavaEvent.register(scoreObserver);

        GperGuavaEvent.post("tom");
        GperGuavaEvent.post(10);

    }

}
