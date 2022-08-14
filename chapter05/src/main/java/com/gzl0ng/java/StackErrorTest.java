package com.gzl0ng.java;

/**
 * 演示栈中的异常
 * StackOverflowError
 * Outofmemory
 * @author 郭正龙
 * @date 2022-08-14
 *
 * 默认情况下：count ： 9787
 * 设置栈大小：-Xss256k  count:2271
 */
public class StackErrorTest {

    private static int count = 1;

    public static void main(String[] args) {
        System.out.println(count++);//9787
        main(args);
    }
}
