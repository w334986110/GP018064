package com.gupao.homework.strategy.channel;

import com.gupao.homework.strategy.IPayService;
import com.gupao.homework.strategy.abs.AbstractDoAfterPay;
import com.gupao.homework.strategy.model.PayResult;
import com.gupao.homework.strategy.model.UnionResponse;

public class UnionPayService extends AbstractDoAfterPay implements IPayService {
    @Override
    public void pay(Long userId,Long amount) {
        PayResult result = checkBalance(userId,amount);
        System.out.println(result.toString());
        if(result.getCode() ==0){
            save();
        }
    }

    @Override
    public void save() {
        System.out.println("保存银联刷卡消费记录");
    }

    @Override
    public PayResult checkBalance(Long userId,Long amount) {
        if(amount > queryBalance(userId)){
            return new PayResult(-1,"银联卡余额不足");
        }
        PayResult payResult = new PayResult(0,"支付成功");
        UnionResponse response = new UnionResponse();
        response.setBankNo("6556324335653654");
        payResult.setEntry(response);
        return payResult;
    }

    @Override
    public Long queryBalance(Long userId) {
        return 999L;
    }
}
