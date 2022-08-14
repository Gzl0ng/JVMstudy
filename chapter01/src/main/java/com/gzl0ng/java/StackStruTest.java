package com.gzl0ng.java;

/**
 * @author 郭正龙
 * @date 2022-08-09
 */
public class StackStruTest {
    public static void main(String[] args) {
        /**
         * 分别执行二次代码 javap -v反编译这个clss文件   第一个直接将结果编译，第二个进行了多次进栈出栈操作
         */


//        int i = 2 + 3;

        int i = 2;
        int j = 3;
        int k = i+j;

        try {
            Thread.sleep(6000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("hello");
    }
}
