package com.gupao.homework.template;

public class TemplateTest {

    public static void main(String[] args) {
        AbstractBankingServices template = new BuyFinancial();
        template.process();

        AbstractBankingServices takeMoney = new TakeMoney();
        takeMoney.process();
    }
}
