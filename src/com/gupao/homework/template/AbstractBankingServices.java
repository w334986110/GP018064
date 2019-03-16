package com.gupao.homework.template;

/**
 * 优点
 *　（1）具体细节步骤实现定义在子类中，子类定义详细处理算法是不会改变算法整体结构。
 *　（2）代码复用的基本技术，在数据库设计中尤为重要。
 *　（3）存在一种反向的控制结构，通过一个父类调用其子类的操作，通过子类对父类进行扩展增加新的行为，符合“开闭原则”。
 * 缺点
 *    每个不同的实现都需要定义一个子类，会导致类的个数增加，系统更加庞大。
 */
public abstract class AbstractBankingServices {

    private static int count = 1;

    protected void process(){

        this.takeNumber();
        this.trabsact();
        this.evaluate();
    }

    // 取号
    private void takeNumber(){

        System.out.println("请第"+ count++ +"到1号窗口办理业务");
    }

    // 办理业务
    public abstract void trabsact();

    // 评价
    private void evaluate(){

        System.out.println("请为本次服务打分。");
    }
}
