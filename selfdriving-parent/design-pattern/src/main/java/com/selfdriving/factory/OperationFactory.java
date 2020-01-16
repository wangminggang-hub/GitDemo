package com.selfdriving.factory;

/**
 * @ClassName OperationFactoryBuilder
 * @Description 初始化运算操作工厂类的类
 * @Author Wangminggang
 * @Date 2020/1/2 19:17
 * @Version 1.0
 */


public class OperationFactory {


    public static Operation createOperation(String operationalSymbol) {
        Operation operation;
        switch (operationalSymbol) {
            case "+":
                operation = new AdditionOperation();
                break;
//            case "-":
//                operation = new SubtractionOperation();
//                break;
            default:
                operation = new SubtractionOperation();
        }
        return operation;
    }

}