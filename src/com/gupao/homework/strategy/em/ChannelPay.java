package com.gupao.homework.strategy.em;

import com.gupao.homework.strategy.IPayService;
import com.gupao.homework.strategy.channel.*;

public enum ChannelPay {
    WX(1,new WxPayService()),
    ALI_PAY(2,new AliPayService()),
    UNION(3,new UnionPayService()),
    CARD(4,new CardPayService()),
    CASH(5,new CashPayService());

    ChannelPay(int id, IPayService payService) {
        this.id = id;
        this.payService = payService;
    }

    private int id;

    private IPayService payService;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IPayService getPayService() {
        return payService;
    }

    public void setPayService(IPayService payService) {
        this.payService = payService;
    }
}
