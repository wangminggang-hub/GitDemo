package com.selfdriving.strategy;

/**
 * @ClassName NormalPay
 * @Description 正常付款
 * @Author Wangminggang
 * @Date 2020/1/6 20:03
 * @Version 1.0
 */
public class NormalPay implements Payment {


    @Override
    public Double pay(double bill) {
        return 666D;
    }

    public Double pay(int count, double price) {
        return count * price;
    }
}