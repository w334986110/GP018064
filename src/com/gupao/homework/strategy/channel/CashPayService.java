package com.gupao.homework.strategy.channel;

import com.gupao.homework.strategy.IPayService;
import com.gupao.homework.strategy.abs.AbstractDoAfterPay;
import com.gupao.homework.strategy.model.PayResult;

public class CashPayService extends AbstractDoAfterPay implements IPayService {
    @Override
    public void pay(Long userId,Long amount) {
        save();
    }

    @Override
    public void save() {
        System.out.println("保存现金消费记录");
    }

    @Override
    public PayResult checkBalance(Long userId,Long amount) {
        return null;
    }

    @Override
    public Long queryBalance(Long userId) {
        return 399L;
    }
}
