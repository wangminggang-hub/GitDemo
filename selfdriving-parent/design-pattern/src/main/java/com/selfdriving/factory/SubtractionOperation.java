package com.selfdriving.factory;

import org.springframework.stereotype.Component;

/**
 * @ClassName SubtractionOperationFactory
 * @Description
 * @Author Wangminggang
 * @Date 2020/1/2 19:23
 * @Version 1.0
 */

@Component
public class SubtractionOperation implements Operation {


    @Override
    public Double calculate(double arg1, double arg2) {
        return arg1 - arg2;
    }
}