package com.gupao.homework.strategy.abs;

import com.gupao.homework.strategy.model.PayResult;

public abstract class AbstractDoAfterPay {

    public abstract void save();

    public abstract PayResult checkBalance(Long userId,Long amount);

    public abstract Long queryBalance(Long userId);

}
