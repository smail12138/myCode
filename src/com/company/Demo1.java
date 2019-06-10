package com.company;

import java.math.BigDecimal;

public class Demo1 {

    public static void main(String[] args) {
        /**
         * 当BigDecimal和Double转换问题
         */
        BigDecimal bigdecimal = new BigDecimal(10.2);
        System.out.println(bigdecimal);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(10.2);
        System.out.println(bigDecimal2);
    }
}
