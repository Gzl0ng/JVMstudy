package com.gzl0ng.java1;

import java.util.ArrayList;

/**
 * @author 郭正龙
 * @date 2022-08-20
 */

/**
 * 测试MinorGC ， MajorGC  ，FullGC
 *
 * -Xms9m -Xmx9m -XX:+PrintGCDetails
 *
 * 字符串常量池以前在方法区，现在在堆空间
 */
public class GCTest {
    public static void main(String[] args) {
        int i = 0;

        try {
            ArrayList<String> list = new ArrayList<>();
            String a = "gzl0ng.com";
            while (true){
                list.add(a);
                a = a + a;
                i++;
            }
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("遍历次数为：" + i);
        }
    }
}
