package com.gupao.homework.strategy.model;

public class UnionResponse extends BaseResponse {

    private String unionCardNo;

    private String bankNo;

    private String bankType;

    public String getUnionCardNo() {
        return unionCardNo;
    }

    public void setUnionCardNo(String unionCardNo) {
        this.unionCardNo = unionCardNo;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }
}
