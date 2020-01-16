package com.selfdriving.strategy;

import java.math.BigDecimal;

/**
 * @ClassName PaymentCalculator
 * @Description 计算用户应付款
 * @Author Wangminggang
 * @Date 2020/1/3 10:25
 * @Version 1.0
 */
public class PaymentCalculator {

    BigDecimal totalPay = new BigDecimal(0);

    //计算某种商品的总价: 平价销售
    public Double productPayment(int amount, double price) {
        return amount * price;
    }

    //某种商品的总价：打折销售
    public Double productPaymentOfDiscount(int amount, double price, double discount) {
        return amount * price * (discount*0.1);
    }


    //返现销售
    public Double productPaymentOfRebate() {

        return 666D;
    }





}