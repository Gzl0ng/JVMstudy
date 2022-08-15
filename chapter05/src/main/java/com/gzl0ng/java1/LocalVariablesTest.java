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



    //练习
    public static void testStatic(){
        LocalVariablesTest test = new LocalVariablesTest();
        Date date = new Date();
        int count = 10;
        System.out.println(count);
        //因为this变量不存在于当前方法的局部变量表中
//        System.out.println(this.count);
    }

    //关于slot的使用理解
    public LocalVariablesTest(){
        this.count = 1;
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
        double weight = 154;//占据二个slot
        char gender = '男';
        return date + name1;
    }

    public void test3(){

        this.count ++;
    }

    public void test4(){
        int a = 0;
        {
            int b = 0;
            b = a+1;
        }
        //变量c使用之前已经销毁的变量b占据的slot的位置
        int c = a+1;
    }

    /*
    变量的分类：按照数据类型分：1基本数据类型 2 引用数据类型
            按照在类中声明的位置分：1成员变量（在使用前，都经历过默认初始化）
                                                 类变量:linking的prepare阶段，给类变量默认赋值--->inital阶段：显示赋值即静态代码块赋值
                                                 实例变量:随着对象的创建，会在堆空间中分配实例空间，并进行默认赋值
                                 2局部变量：在使用前，必须要进行显示赋值！否则，编译不通过
     */

    public void test5Temp(){
        int num;
//        System.out.println(num);//错误信息：Variable 'num' might not have been initialized
    }
}
