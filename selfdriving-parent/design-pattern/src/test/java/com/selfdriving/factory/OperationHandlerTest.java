package com.selfdriving.factory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @ClassName OperationHandlerTest
 * @Description
 * @Author Wangminggang
 * @Date 2020/1/2 19:46
 * @Version 1.0
 */

@SpringBootTest
class OperationHandlerTest {

    @Autowired
    private OperationHandler operationHandler;

    @Test
    void testAdditionCalculate() {
        Double result = operationHandler.operation(1, 2.4, "+");
        assertThat(result, is(3.4));
    }

    @Test
    void testSubtractionCalculate() {
        Double result = operationHandler.operation(3, 8.0, "-");
        assertThat(result, is(-5D));
    }


}