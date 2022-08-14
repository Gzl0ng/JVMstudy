package com.gzl0ng.java1;

/**
 * @author 郭正龙
 * @date 2022-08-14
 *
 * 方法的结束方式分为二种：正常结束，以return为代表
 * 方法执行中出现未捕获的异常，以异常结束
 *
 * 异常往上抛，没有try catch的都是异常结束，处理了的就是正常热土return
 */
public class StackFrameTest {
    public static void main(String[] args) {

        StackFrameTest stackFrameTest = new StackFrameTest();
        stackFrameTest.method1();;
    }

    public void method1(){
        System.out.println("method1()开始执行...");
        method2();
        System.out.println("method1()执行结束...");
    }

    public int method2() {
        System.out.println("method2()开始执行...");
        int i = 10;
        int m = (int)method3();
        System.out.println("method2()即将结束...");
        return i + m;
    }

    public double method3() {
        System.out.println("method3()开始执行...");
        double j = 20.0;
        System.out.println("method3()即将结束...");
        return j;
    }
}
