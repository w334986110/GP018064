package com.gupao.homework.strategy.channel;

import com.gupao.homework.strategy.IPayService;
import com.gupao.homework.strategy.abs.AbstractDoAfterPay;
import com.gupao.homework.strategy.model.CardResponse;
import com.gupao.homework.strategy.model.PayResult;

public class CardPayService extends AbstractDoAfterPay implements IPayService {
    @Override
    public void pay(Long userId,Long amount) {
        PayResult result = checkBalance(userId,amount);
        System.out.println(result.toString());
        if(result.getCode() == 0){
            save();
        }
    }

    @Override
    public void save() {
        System.out.println("保存储值卡消费信息");
    }

    @Override
    public PayResult checkBalance(Long userId,Long amount) {
        if(queryBalance(userId) < amount){
            return new PayResult(-1,"储值卡余额不足");
        }
        PayResult result = new PayResult(0,"支付成功");
        CardResponse response = new CardResponse();
        response.setCardNo("100011");
        response.setBalance(40000L);
        result.setEntry(response);
        return result;
    }

    @Override
    public Long queryBalance(Long userId) {
        return 1100L;
    }
}
