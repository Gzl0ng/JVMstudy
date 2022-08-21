package com.gzl0ng.java;

/**
 * @author 郭正龙
 * @date 2022-08-21
 */

/**
 * 测试设置方法区大小参数的默认值
 * -Xms600m -Xmx600m  在jvisualvm中伊甸区幸存者区和老年区加起来等于设置的堆大小
 * ，证明方法区不在堆中（逻辑上在堆中）
 *
 * jdk7之前：
 * -XX:PermSize=100m -XX:MaxPermSize=100m
 *
 * jdk8之后：
 * -XX:MetaspaceSize=100m -XX:MaxMetaspaceSize=100m
 *
 *
 * 查看方法区大小
 *  jps得到pid  jinfo -flag MetaspaceSize pid
 */
public class MethodAreaDemo {
    public static void main(String[] args) {
        System.out.println("start..");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end...");
    }
}
