package com.gupao.homework.strategy.channel;

import com.gupao.homework.strategy.IPayService;
import com.gupao.homework.strategy.abs.AbstractDoAfterPay;
import com.gupao.homework.strategy.model.PayResult;
import com.gupao.homework.strategy.model.WxResponse;

public class WxPayService extends AbstractDoAfterPay implements IPayService {
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
        System.out.println("保存微信消费记录");
    }

    @Override
    public PayResult checkBalance(Long userId,Long amount) {
        if(amount > queryBalance(userId)){
            return new PayResult(-1,"微信余额不足");
        }
        PayResult result = new PayResult(0,"支付成功");
        WxResponse response = new WxResponse();
        response.setOpenId("WXDFRewr");
        result.setEntry(response);
        return result;
    }

    @Override
    public Long queryBalance(Long userId) {
        return 3000L;
    }
}
