package com.selfdriving.factory;

import org.springframework.stereotype.Service;

/**
 * @ClassName Program
 * @Description 工厂设计模式练习
 * <p>
 * 实现一个计算器程序，要求输入两个数和运算符号，得到结果。
 * @Author Wangminggang
 * @Date 2020/1/2 11:35
 * @Version 1.0
 */
@Service
public class Program {

    public Double calculate(Double num1, Double num2, String operationalSymbol) {
        Double result = null;
        if ("+".equals(operationalSymbol)) {
            result = num1 + num2;
        } else if ("-".equals(operationalSymbol)) {
            result = num1 - num2;
        } else if ("*".equals(operationalSymbol)) {
            result = num1 * num2;
        } else if ("/".equals(operationalSymbol)) {
            result = num1 / num2;
        }
        return result;
    }

    public Double calculate2(double num1, double num2, String operationalSymbol) {
        Double result;
        switch (operationalSymbol) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                result = num1 / num2;

        }
        return result;
    }
}