package com.gupao.homework.strategy.channel;

import com.gupao.homework.strategy.IPayService;
import com.gupao.homework.strategy.abs.AbstractDoAfterPay;
import com.gupao.homework.strategy.model.AliResponse;
import com.gupao.homework.strategy.model.PayResult;

public class AliPayService extends AbstractDoAfterPay implements IPayService {
    @Override
    public void pay(Long userId,Long amount) {
        PayResult result = checkBalance(userId,amount);
        System.out.println(result.toString());
        if(result.getCode() == 0) {
            save();
        }
    }

    @Override
    public void save() {
        System.out.println("保存支付宝支付信息");
    }

    @Override
    public PayResult checkBalance(Long userId,Long amout) {
        if(amout > queryBalance(userId)){
            return new PayResult(-1,"支付宝余额不足");
        }
        AliResponse response = new AliResponse();
        response.setOrderId("12345667777");
        response.setAmount(100L);
        response.setBuyerId("33333333333");
        PayResult result = new PayResult(0,"支付成功");
        result.setEntry(response);
        return  result;
    }

    @Override
    public Long queryBalance(Long userId) {
        return 800L;
    }
}
