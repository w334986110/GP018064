package com.gupao.homework.strategy.model;

public class CardResponse extends BaseResponse {

    private String cardNo;

    private Long balance;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
