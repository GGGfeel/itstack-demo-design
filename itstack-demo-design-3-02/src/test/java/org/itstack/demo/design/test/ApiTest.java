package org.itstack.demo.design.test;

import org.itstack.demo.design.Builder;
import org.itstack.demo.design.newway.Computer;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_Builder(){
        Builder builder = new Builder();

        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());

        // 轻奢田园
        System.out.println(builder.levelTwo(98.25D).getDetail());

        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }

    @Test
    public void test_Computer_Builder(){
        Computer computer=new Computer.Builder("因特尔","三星")
            .setDisplay("三星24寸")
            .setKeyboard("罗技")
            .setUsbCount(2)
            .build();
    }

}
