package com.gzl0ng.java1;

import java.util.Date;

/**
 * @author 郭正龙
 * @date 2022-08-14
 */

//演示虚拟机栈的局部变量表容量大小在编译器就确定的
    //本地变量表为：args形参 类本身 int类型的num
public class LocalVariablesTest {
    private int count = 0;

    public static void main(String[] args) {
        LocalVariablesTest test = new LocalVariablesTest();
        int num = 10;
        test.test1();;
    }

    private void test1() {
        Date date = new Date();
        String name1 = "gzl0ng.com";
        String info = test2(date,name1);
        System.out.println(date+name1);
    }

    private String test2(Date date, String name1) {

        date = null;
        name1 = "gzl0ng";
        double weight = 154;
        return date + name1;
    }

    public void test3(){
        count ++;
    }

    public void test4(){

    }
}
