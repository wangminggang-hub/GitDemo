package com.selfdriving.factory;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName ProgramTest
 * @Description
 * JUnit中的注解
 * @BeforeClass：针对所有测试，只执行一次，且必须为static void
 * @Before：初始化方法，执行当前测试类的每个测试方法前执行。
 * @Test：测试方法，在这里可以测试期望异常和超时时间
 * @After：释放资源，执行当前测试类的每个测试方法后执行
 * @AfterClass：针对所有测试，只执行一次，且必须为static void
 * @Ignore：忽略的测试方法（只在测试类的时候生效，单独执行该测试方法无效）
 * @RunWith:可以更改测试运行器 ，缺省值 org.junit.runner.Runner
 * 一个单元测试类执行顺序为：
 *
 * @BeforeClass –> @Before –> @Test –> @After –> @AfterClass
 *
 * 每一个测试方法的调用顺序为：
 *
 * @Before –> @Test –> @After
 *
 * @Author Wangminggang
 * @Date 2020/1/2 15:01
 * @Version 1.0
 */
@SpringBootTest
class ProgramTest {

    @Autowired
    private Program program;

    /**
     * 在每个测试方法之前执行。
     * 注解在非静态方法上。
     * 可以重新初始化测试方法所需要使用的类的某些属性。
     **/
    @BeforeEach
    void setUp() {
    }

    /**
     * 在每个测试方法之后执行。
     * 注解在非静态方法上。
     * 可以回滚测试方法引起的数据库修改
     **/
    @AfterEach
    void tearDown() {
    }

    /**
     *
     **/
    @Test
    void additionCalculate() {
        Double result = program.calculate(0.9, 10D, "+");
        assertThat(result, is(10.9));
    }

    
    @Test
    void subtractionCalculate() {
        Double difference = program.calculate(1.2, 2.5, "-");
        assertThat(difference, is(-1.3));
    }

    @Test
    void multiplicationCalculate() {
        Double result = program.calculate(1.5, 4D, "*");
        assertThat(result, is(6.0));
    }

    @Test
    void divisionOperation() {
        Double result = program.calculate(5D, 2D, "/");
        assertThat(result, is(2.5));
    }

    @Test
    void additionCalculate2() {
        Double result = program.calculate2(0.9, 10D, "+");
        assertThat(result, is(10.9));
    }


    @Test
    void subtractionCalculate2() {
        Double difference = program.calculate2(1.2, 2.5, "-");
        assertThat(difference, is(-1.3));
    }

    @Test
    void multiplicationCalculate2() {
        Double result = program.calculate2(1.5, 4D, "*");
        assertThat(result, is(6.0));
    }

    @Test
    void divisionOperation2() {
        Double result = program.calculate2(5D, 2D, "/");
        assertThat(result, is(2.5));
    }


}