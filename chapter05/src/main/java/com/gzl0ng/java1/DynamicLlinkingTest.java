package com.gzl0ng.java1;

/**
 * @author 郭正龙
 * @date 2022-08-16
 */
public class DynamicLlinkingTest {

    int num = 10;

    public void methodA(){
        System.out.println("methodA()...");
    }

    public void methodB(){
        System.out.println("methodB()...");

        methodA();

        num++;
    }
}
