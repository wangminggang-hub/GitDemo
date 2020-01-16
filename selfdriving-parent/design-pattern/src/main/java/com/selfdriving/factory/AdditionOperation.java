package com.selfdriving.factory;

/**
 * @ClassName AdditionOperationFactory
 * @Description 加法运算操作工厂类
 * @Author Wangminggang
 * @Date 2020/1/2 19:13
 * @Version 1.0
 */

public class AdditionOperation implements Operation {

    @Override
    public Double calculate(double arg1, double arg2) {
        return arg1 + arg2;
    }

}