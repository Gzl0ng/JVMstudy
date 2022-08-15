package com.gzl0ng.java1;

/**
 * @author 郭正龙
 * @date 2022-08-15
 */
public class OperandStackTest {
    public void testAddOperation(){
        //byte,short,char,boolean：都以int型来保存
        byte i = 15;
        int j = 8;
        int k = i + j;

        //当m小于8 入操作栈是bipush操作，大于8为sipush，超过short类型为ipush，超过int类型报错
        // int m = 8
    }

    public int getSum(){
        int m = 10;
        int n = 20;
        int k = m+n;
        return k;
    }

    public void testGetSum(){
        //返回上一个栈桢返回的结果，并保存在操作数栈中
        int i = getSum();
        int j = 10;
    }

    /*
    程序面试过程中，常见的i++和++i的区别
     */

    public void add(){
        //第一类问题
        int i1 = 10;
        i1++;

        int i2 = 10;
        ++i2;

        //第二类问题
        int i3 = 10;
        int i4 = i3++;

        int i5=10;
        int i6 = ++i5;

        //第三类问题
        int i7 = 10;
        i7 = i7++;

        int i8 = 10;
        i8 = i8++;

        //第四类问题
        int i9 = 10;
        int i10 = i9++ + ++i9;
    }
}
