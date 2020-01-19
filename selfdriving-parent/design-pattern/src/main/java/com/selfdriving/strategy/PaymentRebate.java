package com.selfdriving.strategy;

/**
 * @ClassName CashRebate
 * @Description 打折计价
 * @Author Wangminggang
 * @Date 2020/1/6 19:22
 * @Version 1.0
 */
public class PaymentRebate implements Payment {


    @Override
    public Double pay(double bill) {
        return null;
    }

    /**
     * @param count  商品数量
     * @param price  商品价格
     * @param rebate 打折额度
     * @return java.lang.Double
     * @Author wangm
     * @Description rebatePayment
     * @Date 2020/1/6 20:01
     * @Param
     **/
    public Double rebatePayment(int count, double price, double rebate) {
        return count * price * rebate;
    }


}