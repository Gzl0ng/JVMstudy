package com.gzl0ng.java3;

/**
 * @author 郭正龙
 * @date 2022-08-20
 */

/**
 * 方法中定义的局部变量是否线程安全？具体情况具体分析
 *      线程安全：
 *          如果只有一个线程才可以操作此数据，则必是线程安全的。
 *          如果有多个线程操作此数据，则此数据是共享数据。如果不考虑同步机制的话。存在线程安全问题
 *
 *
 *  逃逸：方法内部对象传到外面或者接受外部对象，2和3方法
 */
public class StringBuilderTest {

    int num = 10;

    //s1的声明方式是线程安全的
    public static void method1(){
        //StringBuilder：线程不安全的对象
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
        //...
    }

    //stringBuilder:是线程不安全的
    public static void method2(StringBuilder stringBuilder){
        //StringBuilder：线程不安全
        stringBuilder.append("a");
        stringBuilder.append("b");
        //...
    }

    //s1的操作：是线程不安全的（被返回出去，可能被其它线程操作）
    public static StringBuilder method3(){
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
        return s1;
    }

    //s1的操作：是线程安全的
    public static String method4(){
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
        return s1.toString();
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        //并发操作s
        new Thread(() ->{
            s.append("a");
            s.append("b");
        }) .start();
        method2(s);

        /**
         * method1修改num并且一个线程去修改nub就会有线程安全问题。
         */
//        method1();
//
//        new Thread(){
//
//            @Override
//            public void run() {
//                super.run();
//            }
//        };
    }
}
