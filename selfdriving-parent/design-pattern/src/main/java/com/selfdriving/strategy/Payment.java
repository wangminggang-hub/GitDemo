package com.selfdriving.strategy;

/**
 * @ClassName Payment
 * @Description 结账付款接口
 * 1.商品单价*商品数量=每种商品总价；
 * 2.每种商品总价求和即为用户应付款额;
 * @Author Wangminggang
 * @Date 2020/1/3 10:20
 * @Version 1.0
 */
public interface Payment {

    Double pay(double bill);

}
