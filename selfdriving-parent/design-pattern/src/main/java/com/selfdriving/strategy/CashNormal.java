package com.selfdriving.strategy;

/**
 * @ClassName CashNormal
 * @Description 正常收费类
 * @Author Wangminggang
 * @Date 2020/1/6 20:13
 * @Version 1.0
 */
public class CashNormal extends CashSuper {
    @Override
    Double acceptCash(double money) {

        return money;
    }
}